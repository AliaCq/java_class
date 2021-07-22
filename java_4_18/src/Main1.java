import java.sql.*;

public class Main1 {
    public static void 转账(int fromld,int told,int money) throws SQLException,InterruptedException {
        try (Connection c = DatabaseUtil.getConnection()) {
            c.setAutoCommit(false);//默认是true
            try(PreparedStatement s1 = c.prepareStatement("update account set money = money-? where id = ?");
                PreparedStatement s2= c.prepareStatement("update account set money = money+? where id = ?");
            ){
                s1.setInt(1,money);
                s1.setInt(2,fromld);
                s1.executeUpdate();

                s2.setInt(1,money);
                s2.setInt(2,told);
                s2.executeUpdate();
                c.commit();
            }finally {
                c.rollback();
            }
        }
    }

    private static void 演示SQL注入(String name) throws SQLException {
        try (Connection c = DatabaseUtil.getConnection()){
            String sql = String.format("select * from account where name='%s'",name);
            //System.out.println(sql);
            try(Statement s = c.createStatement()){
                final ResultSet rs = s.executeQuery(sql);
                while (rs.next()){
                    System.out.println(rs.getString("id"));
                    System.out.println(rs.getString("name"));
                    System.out.println(rs.getString("money"));
                }
            }
        }
    }

    public static void main(String[] args) throws SQLException, InterruptedException {
        //转账(1,2,10);
        演示SQL注入("A");
    }
}
