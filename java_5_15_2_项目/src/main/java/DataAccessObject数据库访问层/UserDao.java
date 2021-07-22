package dao;

import model.User;
import util.DBUtil;

import java.sql.*;

public class UserDao {
    //插入
    public User insert(Integer sn, String name, String password) throws SQLException {
        String sql = "INSERT INTO students (sn, name, password) VALUES (?, ?, ?)";
        try (Connection c = DBUtil.connection()) {
            try (PreparedStatement s = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                s.setInt(1, sn);
                s.setString(2, name);
                s.setString(3, password);

                s.executeUpdate();

                int sid;
                try(ResultSet rs = s.getGeneratedKeys()){
                    rs.next();
                    sid = rs.getInt(1);
                }
                User user = new User();
                user.sid = sid;
                user.sn = sn;
                user.name = name;
                return user;
            }
        }
    }

    //查询
    public User selectByNameAndPassword(String name, String password) throws SQLException {
        String sql = "SELECT sid, sn, name FROM students WHERE name = ? AND password = ?";
        try (Connection c = DBUtil.connection()) {
            try (PreparedStatement s = c.prepareStatement(sql)) {
                s.setString(1, name);
                s.setString(2, password);

                try (ResultSet rs = s.executeQuery()) {
                    if (!rs.next()) {
                        return null;
                    }

                    User user = new User();
                    user.sid = rs.getInt("sid");
                    user.sn = rs.getInt("sn");
                    user.name = rs.getString("name");

                    return user;
                }
            }
        }
    }
}
