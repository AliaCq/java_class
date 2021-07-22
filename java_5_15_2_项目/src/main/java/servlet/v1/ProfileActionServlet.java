package servlet.v1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login/profile.action")
public class ProfileActionServlet extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        //获取信息
        String username = (String) session.getAttribute("username");

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();

        if (username == null) {
            writer.println("用户没有登录");
        } else {
            String password = (String) session.getAttribute("password");
            long timestamp = (Long) session.getAttribute("timestamp");
            writer.println("用户名: " + username);
            writer.println("密码: " + password);
            writer.println("时间戳: " + timestamp);
        }
    }
}
