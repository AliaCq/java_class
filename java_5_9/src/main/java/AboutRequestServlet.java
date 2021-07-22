import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

//@WebServlet("/about-request") //精确URL
//@WebServlet("*.api")  //统配所有.api结尾的
//@WebServlet("") //首页
//@WebServlet("/") //所有URL
public class AboutRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         /*
        请求中的重要信息：
        1. 方法
        2. 路径
           1. ContextPath
           2. ServletPath
        3. 请求的版本
        4. 请求头信息
        5. 请求体（GET 方法没有请求体）
         */
        String method = req.getMethod();
        System.out.println("请求方法是: " + method);

        String requestURI = req.getRequestURI();
        System.out.println("请求完整路径: " + requestURI);

        String contextPath = req.getContextPath();
        System.out.println("Context Path: " + contextPath);

        String servletPath = req.getServletPath();
        System.out.println("Servlet Path: " + servletPath);

        String protocol = req.getProtocol();
        System.out.println("版本信息: " + protocol);

        System.out.println("下面都是请求头:");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = req.getHeader(name);
            System.out.println(name + " 是 " + value);
        }

    }
}
