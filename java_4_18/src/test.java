//1.获取连接 connection
//2.多次的获取 statement
//3.statement.executeQuery() statement.executeUpdate()

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    // SHOW TABLES
    public static void main(String[] args) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName("127.0.0.1");
        dataSource.setPort(3306);
        dataSource.setUser("root");
        dataSource.setPassword("cq1030");
        dataSource.setDatabaseName("JAVA21_2021_04_18_library");

        dataSource.setCharacterEncoding("utf8");
        dataSource.setUseSSL(false);
        dataSource.setServerTimezone("Asia/Shanghai");

        Connection connection = dataSource.getConnection();

        String sql = "SHOW TABLES";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String tableName = resultSet.getString(1);
            System.out.println(tableName);
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
