import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {
//        Connection c = null;
//        try {
//            c = DatabaseUtil.getConnection();
//        } finally {
//            if (c != null) {
//                c.close();
//            }
//        }

        // try-with-resource 的写法
        try (Connection c = DatabaseUtil.getConnection()) {
            String sql = "SHOW TABLES";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                try (ResultSet r = s.executeQuery()) {
                    while (r.next()) {
                        System.out.println(r.getString(1));
                    }
                } // 自动调用 r.close() 无论是否抛异常
            } // 自动调用 s.close() 无论是否抛异常
        }   // 自动调用 c.close() 无论是否抛异常
    }
}