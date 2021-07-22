package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    // 录入学生
    public static void insertStudent(Connection c, int sn, String studentsname) throws SQLException {
        String sql = "INSERT INTO students (sn, studentsname) VALUES (?, ?)";
        try (PreparedStatement s = c.prepareStatement(sql)) {
            s.setInt(1, sn);
            s.setString(2, studentsname);

            s.executeUpdate();
        }
    }
    // 书上架
    public static void addBook(Connection c, int isbn, String name, int total, String time) throws SQLException {
        if (existBook(c, isbn)) {
            String sql = "UPDATE books SET stock = stock + ?, total = total + ? WHERE isbn = ?";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1, total);
                s.setInt(2, total);
                s.setInt(3, isbn);

                s.executeUpdate();
            }
        } else {
            String sql = "INSERT INTO books (isbn, name, total, stock, time) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1, isbn);
                s.setString(2, name);
                s.setInt(3, total);
                s.setInt(4, total);
                s.setString(5, time);

                s.executeUpdate();
            }
        }
    }

    private static boolean existBook(Connection c, int isbn) throws SQLException {
        String sql = "SELECT bid FROM books WHERE isbn = ?";
        try (PreparedStatement s = c.prepareStatement(sql)) {
            s.setInt(1, isbn);
            try (ResultSet r = s.executeQuery()) {
                return r.next();
            }
        }
    }
    // 书下架
    // 检索
    // 借书
    // 还书

    public static void main(String[] args) throws SQLException {
        try (Connection c = DatabaseUtil.getConnection()) {
            addBook(c, 20210418, "MySQL 浅度学习", 10, "1993-10-01");
            insertStudent(c,20200418,"8");
        }
    }
}