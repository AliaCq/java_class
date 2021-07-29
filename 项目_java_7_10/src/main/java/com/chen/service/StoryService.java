package com.chen.service;

import com.chen.dao.StoryDao;
import com.chen.model.Story;

import javax.servlet.http.Part;
import java.io.InputStream;
import java.sql.SQLException;

public class StoryService {
    private final StoryDao storyDao = new StoryDao();

    public Story detail(int sid) throws SQLException {
        return storyDao.selectOneUsingSid(sid);
    }

    public InputStream getAudio(int sid) throws SQLException{
        return storyDao.selectOneAuioColumnUsingSid(sid);
    }

    public void save(int aid, String name, InputStream audio) throws SQLException {
        storyDao.insert(aid,name,audio);
    }
}
