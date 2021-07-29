package com.chen.dao;

import com.chen.model.Album;
import com.chen.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlbumDao {
    public Album selectOneUsingAid(int aid) throws SQLException{
        try(Connection c = DBUtil.getConnection()) {
            {
                String sql = "select uid,name,cover,header,brief,created_at,count from album where aid = ?";
                try (PreparedStatement s = c.prepareStatement(sql)) {
                    s.setInt(1, aid);
                    try (ResultSet rs = s.executeQuery()) {
                        if (!rs.next()) {
                            //没有找到
                            return null;
                        }
                        Album album = new Album();
                        album.aid = aid;
                        album.uid = rs.getInt("uid");
                        album.name = rs.getString("name");
                        album.brief = rs.getString("brief");
                        album.cover = rs.getString("cover");
                        album.header = rs.getString("header");
                        album.count = rs.getInt("count");
                        album.createdAt = rs.getDate("created_at");
                        return album;
                    }
                }
            }
        }
    }

    public List<Album> selectListDefault() throws SQLException{
        List<Album> albumList = new ArrayList<>();

        try(Connection c = DBUtil.getConnection()){
            String sql = "SELECT aid, name, cover, count FROM album ORDER BY aid DESC LIMIT 20";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                try (ResultSet rs = s.executeQuery()) {
                    while (rs.next()) {
                        Album album = new Album();

                        album.aid = rs.getInt("aid");
                        album.name = rs.getString("name");
                        album.cover = rs.getString("cover");
                        album.count = rs.getInt("count");

                        albumList.add(album);
                    }
                }
            }
        }
        return albumList;
    }

    public List<Album> selectListLikeName(String likeName) throws SQLException{
        List<Album> albumList = new ArrayList<>();

        try(Connection c = DBUtil.getConnection()){
            String sql = "SELECT aid, name, cover, count FROM album where name like ? ORDER BY aid DESC LIMIT 20";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                s.setString(1,"%" + likeName + "%");
                try (ResultSet rs = s.executeQuery()) {
                    while (rs.next()) {
                        Album album = new Album();

                        album.aid = rs.getInt("aid");
                        album.name = rs.getString("name");
                        album.cover = rs.getString("cover");
                        album.count = rs.getInt("count");

                        albumList.add(album);
                    }
                }
            }
        }
        return albumList;
    }

    public int insert(int uid, String name, String brief, String cover, String header) throws SQLException{
        try(Connection c = DBUtil.getConnection()){
            String sql = "insert into album (uid, name, brief, cover,header) values (?, ?, ?, ?, ?)";
            try (PreparedStatement s = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                s.setInt(1,uid);
                s.setString(2,name);
                s.setString(3,brief);
                s.setString(4,cover);
                s.setString(5,header);

                s.executeUpdate();

                try(ResultSet rs = s.getGeneratedKeys()){
                    rs.next();
                    return rs.getInt(1);
                }
            }
        }
    }

    public List<Album> selectListUsingUid(int uid) throws SQLException{
        List<Album> albumList = new ArrayList<>();
        String sql = "SELECT aid, name, cover, count FROM album where uid = ? ORDER BY aid DESC";
        try (Connection c = DBUtil.getConnection()) {
            try (PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1, uid);
                try (ResultSet rs = s.executeQuery()) {
                    while (rs.next()) {
                        Album album = new Album();

                        album.aid = rs.getInt("aid");
                        album.name = rs.getString("name");
                        album.cover = rs.getString("cover");
                        album.count = rs.getInt("count");

                        albumList.add(album);
                    }
                }
            }
        }
        return  albumList;
    }
}
