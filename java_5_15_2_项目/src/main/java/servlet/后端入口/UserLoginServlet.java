package servlet.后端入口;

import model.User;
import service逻辑层.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet ("/user/register.action")
public class UserLoginServlet extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("username");
        String password = req.getParameter("password");

        try {
            User user = userService.login(name, password);
            if (user == null) {
                resp.sendRedirect("/user/login.html");
                return;
            }

            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            resp.sendRedirect("/");
        } catch (SQLException exc) {
            throw new ServletException(exc);
        }
    }
}
