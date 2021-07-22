package servlet.v1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login/login.action")
public class LogingAction extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {
        //获取信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        long timestamp = System.currentTimeMillis();

        //保存信息
        HttpSession session = req.getSession();
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        session.setAttribute("timestamp", timestamp);

        //重定向
        resp.sendRedirect("/login/profile.action");
    }
}
