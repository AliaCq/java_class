package com.chen.api;

import com.chen.model.Album;
import com.chen.service.AlbumService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.SQLException;


@WebServlet("/api/album-detail.json")
public class AlbumDetailApi extends AbsApiServlet {
    private final AlbumService albumService = new AlbumService();

    @Override
    protected Object doGetInternal(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ApiException {
        String aid = req.getParameter("aid");
        if (aid == null || aid.trim().isEmpty()){
            //没有aid  显示错误
            throw new ApiException(400,"aid参数是必须的");
        }

        int aidInt = Integer.parseInt(aid);
        Album album = albumService.detail(aidInt);
        if (album == null){
            //404
            throw new ApiException(404, "aid对应的专辑不存在");
        }
        return album;
    }
}
