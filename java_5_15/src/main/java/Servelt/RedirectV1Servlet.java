package Servelt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirect/v1")
public class RedirectV1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //自己给状态码
        //resp.setStatus(302);
        //resp.setHeader("location","/message-list.json");
        //不用给状态码
        resp.sendRedirect("/message-list.json");
    }
}
