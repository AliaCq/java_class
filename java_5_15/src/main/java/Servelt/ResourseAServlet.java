package Servelt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ra")
public class ResourseAServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ResourseAServlet.doget");
        //重定向
        //resp.sendRedirect("/rb");
        //转发
        //req.getRequestDispatcher("/rb").forward(req,resp);
    }
}
