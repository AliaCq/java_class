import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//提供了一个url是dynamic-get的资源
//并且这个资源只支持通过get方法请求方法
//相当于开发了一本书的资源  只支持来拿get
@WebServlet("/dynamic-get")
public class DynamicGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DynamicGetServlet 的doget被执行了");
    }
}
