package com.chen.api;

import com.chen.model.Album;
import com.chen.model.User;
import com.chen.service.AlbumService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

@WebServlet("/api/edit-album-detail.json")
public class EditAlbumDetialApi extends AbsApiServlet{
    private AlbumService albumService = new AlbumService();
    @Override
    protected Object doGetInternal(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ApiException {
        //1.获取当前用户是否登录
        User currentUser = (User)req.getSession().getAttribute("currentUser");
        if (currentUser == null){
            throw new ApiException(401,"用户必须登录");
        }

        //2.判断用户是否提供了aid
        String aid = req.getParameter("aid");
        if(aid == null || aid.trim().isEmpty()){
            throw new ApiException(400,"aid是必须的");
        }
        int aidInt = Integer.parseInt(aid);
        //根据aid获取对应专辑
        Album album = albumService.detail(aidInt);

        //从aid获取的专辑不存在
        if (album == null){
            throw new ApiException(404,"aid对应的专辑不存在");
        }

        //判断专辑的作者是否是当前用户
        //System.out.println(album);
        //System.out.println(album.uid);
        //System.out.println(currentUser.uid);
        if(!album.uid.equals(currentUser.uid)){
            throw new ApiException(403,"只有专辑的作者有权限使用");
        }

        //返回专辑信息
        return album;
    }
}
