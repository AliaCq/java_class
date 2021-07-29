package com.chen.dao;

import com.chen.model.Story;
import com.chen.util.DBUtil;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StoryDao {
    public Story selectOneUsingSid(int sid) throws SQLException{
        try(Connection c = DBUtil.getConnection()) {
            String sql = "select sid,name,created_at,count from story where sid = ?";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1, sid);
                try (ResultSet rs = s.executeQuery()) {
                    if (!rs.next()) {
                        //404
                        return null;
                    }
                    Story story = new Story();
                    story.sid = sid;
                    story.name = rs.getString("name");
                    story.createdAt = rs.getDate("created_at");
                    story.count = rs.getInt("count");
                    return story;
                }
            }
        }
    }

    public List<Story> selectListUsingAid(int aid) throws SQLException {
        List<Story> storyList = new ArrayList<>();
        try (Connection c = DBUtil.getConnection()) {
            String sql = "select sid,name,created_at,count from story where aid = ? order by sid asc";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1, aid);
                try (ResultSet rs = s.executeQuery()) {
                    while (rs.next()) {
                        Story story = new Story();
                        story.sid = rs.getInt("sid");
                        story.name = rs.getString("name");
                        story.count = rs.getInt("count");
                        story.createdAt = rs.getDate("created_at");
                        storyList.add(story);
                    }
                }
            }
        }
        return storyList;
    }

    public InputStream selectOneAuioColumnUsingSid(int sid) throws SQLException{
        try(Connection c = DBUtil.getConnection()){
            String sql = "select audio from story where sid = ?";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1, sid);
                try (ResultSet rs = s.executeQuery()) {
                    if (!rs.next()) {
                        return null;
                    }
                    return rs.getBinaryStream("audio");
                }
            }
        }
    }

    public void insert(int aid, String name, InputStream audio) throws SQLException {
        try(Connection c = DBUtil.getConnection()){
            String sql = "insert into story (aid,name,audio) values (?, ?, ?)";
            try(PreparedStatement s = c.prepareStatement(sql)){
                s.setInt(1,aid);
                s.setString(2,name);
                s.setBlob(3,audio);

                s.executeUpdate();
            }
        }
    }
}
