package com.chen.api;

import com.chen.model.User;
import com.chen.service.AlbumService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

@WebServlet("/api/my-album-list.json")
public class MyAlbumListApi extends AbsApiServlet {
    private AlbumService albumService = new AlbumService();
    @Override
    protected Object doGetInternal(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ApiException {
        //1.获取当前用户是否登录
        User currentUser = (User)req.getSession().getAttribute("currentUser");
        if (currentUser == null){
            throw new ApiException(401,"用户必须登录");
        }
        return albumService.listUsingUid(currentUser.uid);
    }
}
