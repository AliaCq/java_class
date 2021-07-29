package com.chen.api;

import com.chen.model.Story;
import com.chen.service.StoryService;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

@WebServlet("/api/story-detail.json")
public class StoryDetailApi extends AbsApiServlet {
    private final StoryService storyService = new StoryService();
    @Override
    protected Object doGetInternal(HttpServletRequest req, HttpServletResponse resp) throws ApiException, SQLException {
        String sid = req.getParameter("sid");
        if (sid == null || sid.trim().isEmpty()){
            //400
            throw new ApiException(400,"参数sid是必须的");
        }
        int sidInt = Integer.parseInt(sid);
        Story story = storyService.detail(sidInt);
        if (story == null) {
            //404
            throw new ApiException(404, "sid对应的故事不存在");
        }
        //正常处理
       return story;
    }
}
