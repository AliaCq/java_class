package com.chen.api;

import com.chen.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/api/story-played.json")
public class StoryPlayedApi extends AbsApiServlet {
    @Override
    protected Object doGetInternal(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ApiException, IOException, ServletException {
        int sid = Integer.parseInt(req.getParameter("sid"));
        //不做任何差错处理  例如sid没有传 sid对应的故事不存在 数据不一致等

        int aid;
        try(Connection c = DBUtil.getConnection()) {
            //根据sid查出对应的aid
            String sql0 = "select aid from story where sid = ?";
            try(PreparedStatement s = c.prepareStatement(sql0)){
                s.setInt(1,sid);
                try(ResultSet rs = s.executeQuery()){
                    if (!rs.next()){
                        throw new ApiException(404,"对应故事不存在");
                    }
                    aid = rs.getInt("aid");
                }
            }
        }

        //从性能上说，其实一条Connection就可以完成三条sql是最好的
        try(Connection c = DBUtil.getConnection()) {
            //为了让事务可以顺序 必须关闭自动提交
            c.setAutoCommit(false);

            //完成两条sql
            //1.更新故事中的播放列表
            String sql1 = "update story set count = count + 1 where sid = ?";
            try(PreparedStatement s = c.prepareStatement(sql1)){
                s.setInt(1,sid);
                s.executeUpdate();
            }
            //2.更新专辑中的播放列表
            String sql2 = "update album set count = count + 1 where aid = ?";
            try(PreparedStatement s = c.prepareStatement(sql2)){
                s.setInt(1,aid);
                s.executeUpdate();
            }
            //保证事务的提交 要成功都成功  要失败都失败
            c.commit();
        }

        return null;
    }
}
