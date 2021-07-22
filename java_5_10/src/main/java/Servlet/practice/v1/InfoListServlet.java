package Servlet.practice.v1;

import model.information;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/practice/v1/info-list")
public class InfoListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    private List<information> getInfoList() throws SQLException {
        List<information> list = new ArrayList<>();
        try (Connection c = DBUtil.connection()) {
            String sql = "SELECT name, gender, hobby,edu,suggestion FROM information ORDER BY id DESC";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                try (ResultSet rs = s.executeQuery()) {
                    while (rs.next()) {
                        information info = new information();
                        info.name = rs.getString("name");
                        info.gender = rs.getString("gender");
                        String[] hobbies = rs.getString("hobby").split(":");
                        info.hobbyList.addAll(Arrays.asList(hobbies));
                        info.edu = rs.getString("edu");
                        info.suggestion = rs.getString("suggestion");

                        list.add(info);
                    }
                }
            }
            return list;
        }
    }
}
