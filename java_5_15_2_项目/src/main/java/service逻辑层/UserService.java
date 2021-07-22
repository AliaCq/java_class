package service逻辑层;

import dao.UserDao;
import model.User;

import java.sql.SQLException;

public class UserService {
    private final UserDao userDao = new UserDao();

    //注册的时候将信息插入
    public User register(int sn, String name, String password) throws SQLException {
       return userDao.insert(sn, name, password);
    }

    //登录的时候去数据库查询返回查询的信息
    public User login(String name, String password) throws SQLException {
        return userDao.selectByNameAndPassword(name, password);
    }
}
