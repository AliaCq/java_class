package Servlet.practice.v3;

import model.information;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import util.DBUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/practice/v3/info-list")
public class InfoListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        TemplateEngine engine = (TemplateEngine) servletContext.getAttribute("template-engine");
        WebContext webContext = new WebContext(req, resp, servletContext);

        List<information> infoList = getInfoList();
        webContext.setVariable("infoList", infoList);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        engine.process("practice/v3/info-list", webContext, writer);
//        String process = engine.process("practice/v3/info-list", webContext);
//        writer.print(process);
    }

    private List<information> getInfoList() throws ServletException {
        List<information> informationList = new ArrayList<>();
        try (Connection c = DBUtil.connection()) {
            String sql = "SELECT name, gender, hobby, edu, suggestion FROM information ORDER BY id";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                try (ResultSet rs = s.executeQuery()) {
                    while (rs.next()) {
                        information info = new information();
                        info.name = rs.getString("name");
                        info.gender = rs.getInt("gender") == 0 ? "女" : "男";
                        String[] hobbies = rs.getString("hobby").split(":");
                        info.hobbyList.addAll(Arrays.asList(hobbies));
                        info.edu = rs.getString("edu");
                        info.suggestion = rs.getString("suggestion");

                        informationList.add(info);
                    }
                }
            }
        } catch (SQLException exc) {
            throw new ServletException(exc);
        }

        return informationList;
    }
}
