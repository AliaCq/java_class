import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/about-response")
public class AboutResponseServlet extends HttpServlet {
    private int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        关于响应中的重要信息有：
        1. 状态码 + 描述符
        2. 响应头
        3. 响应体
         */

        // 我们负责填充 resp 对象中的相应值
        //resp.setStatus(200);    // 不写也可以，因为默认值就是 200
        resp.setHeader("X-ClassName", "Java21");
        count++;

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        //resp.setHeader("Content-Type", "text/html; charset=utf-8");

        PrintWriter writer = resp.getWriter();
        writer.printf("<h1>这是我的第一个动态响应内容</h1>");
        writer.printf("<p>页面被访问了 %d 次</p>\r\n", count);
    }
}
