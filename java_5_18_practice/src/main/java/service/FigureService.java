package service;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import model.Figure;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FigureService {
    private static final DataSource datasource;
        static {
            MysqlDataSource mysqlDataSource = new MysqlDataSource();
            mysqlDataSource.setServerName("127.0.0.1");
            mysqlDataSource.setPort(3306);
            mysqlDataSource.setUser("root");
            mysqlDataSource.setPassword("cq1030");
            mysqlDataSource.setDatabaseName("java_5_18_picture");
            mysqlDataSource.setUseSSL(false);
            mysqlDataSource.setCharacterEncoding("utf-8");
            mysqlDataSource.setServerTimezone("Asia/Shanghai");

            datasource = mysqlDataSource;
        }

    public List<Figure> getList() throws SQLException {
        String sql = "Select id,title,URL,`desc` from resource";
        List<Figure> list = new ArrayList<>();
        try(Connection c = datasource.getConnection()) {
            try (PreparedStatement s = c.prepareStatement(sql)) {
                try (ResultSet rs = s.executeQuery()) {
                    while (rs.next()) {
                        Figure figure = new Figure();
                        figure.id = rs.getInt("id");
                        figure.URL = rs.getString("URL");
                        figure.title = rs.getString("title");
                        figure.desc = rs.getString("desc");
                        list.add(figure);

                    }
                }
            }
            return list;
        }
    }
}
