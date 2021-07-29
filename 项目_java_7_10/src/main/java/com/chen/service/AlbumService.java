package com.chen.service;

import com.chen.dao.AlbumDao;
import com.chen.dao.StoryDao;
import com.chen.model.Album;

import java.sql.SQLException;
import java.util.List;

public class AlbumService {
    private final AlbumDao albumDao = new AlbumDao();
    private final StoryDao storyDao = new StoryDao();

    public List<Album> latestList(String keyword) throws SQLException {
        if (keyword == null) {
            return albumDao.selectListDefault();
        } else {
            return albumDao.selectListLikeName(keyword);
        }
    }

    public Album detail(int aid) throws SQLException {
        Album album = albumDao.selectOneUsingAid(aid);
        if (album == null) {
            return null;
        }
        album.storyList = storyDao.selectListUsingAid(aid);
        return album;
    }

    public int save(int uid,String name,String brief,String cover,String header) throws SQLException{
        return albumDao.insert(uid,name,brief,cover,header);
    }


    public List<Album> listUsingUid(int uid) throws SQLException {
        return albumDao.selectListUsingUid(uid);
    }
}

