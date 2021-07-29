package com.chen.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
    private static DataSource dataSource = null;

    private static void initDatasource(){
        Properties properties = ConfigUtil.getProperties();

        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName(properties.getProperty("db.host"));
        mysqlDataSource.setPort(Integer.parseInt(properties.getProperty("db.port")));
        mysqlDataSource.setUser(properties.getProperty("db.user"));
        mysqlDataSource.setPassword(properties.getProperty("db.password"));
        mysqlDataSource.setDatabaseName(properties.getProperty("db.database"));
        mysqlDataSource.setCharacterEncoding("utf8");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setServerTimezone("Asia/Shanghai");

        dataSource = mysqlDataSource;
    }

    public static Connection getConnection() throws SQLException {
        if (dataSource == null){
            synchronized (DBUtil.class){
                if(dataSource == null){
                    initDatasource();
                }
            }
        }
        return dataSource.getConnection();
    }
}
