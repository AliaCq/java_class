package servlet;

import model.Figure;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            ServletContext servletContext = req.getServletContext();
            WebContext context = new WebContext(req,resp,servletContext);
            List<Figure> list = new service.FigureService().getList();

            context.setVariable("figureList",list);
            TemplateEngine engine = (TemplateEngine)servletContext.getAttribute("engine");
            resp.setContentType("text/html");
            resp.setCharacterEncoding("utf-8");
            String s = engine.process("index", context);
            engine.process("index",context,resp.getWriter());
        } catch (SQLException throwables) {
            throw new ServletException();
        }
    }
}
