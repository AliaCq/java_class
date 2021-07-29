package com.chen.api;

import com.chen.model.Album;
import com.chen.model.User;
import com.chen.service.AlbumService;
import com.chen.service.StoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.sql.SQLException;

@MultipartConfig
@WebServlet("/api/new-story.json")
public class NewStoryApi extends AbsApiServlet{
    private AlbumService albumService = new AlbumService();
    private StoryService storyService = new StoryService();
    @Override
    protected Object doPostInternal(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ApiException, IOException, ServletException {
        User currentUser = (User)req.getSession().getAttribute("currentUser");
        if (currentUser == null){
            throw new ApiException(401,"用户必须先登录");
        }
        String name = req.getParameter("name");
        int aid = Integer.parseInt(req.getParameter("aid"));
        Part audio = req.getPart("audio");

        Album album = albumService.detail(aid);
        if (album == null){
            throw new ApiException(404,"对应专辑不存在");
        }
        if (!album.uid.equals(currentUser.uid)){
            throw new ApiException(403,"只有专辑作者才有添加故事的权限");
        }

        //添加故事
        storyService.save(aid,name,audio.getInputStream());

        return null;
    }
}
