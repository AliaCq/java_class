package Servelt;

import model.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/message-list.json")
public class MessageListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Message m1 = new Message();
        m1.who = "A";
        m1.target = "AA";
        m1.what = "AAA";

        Message m2 = new Message();
        m2.who = "B";
        m2.target = "BB";
        m2.what = "BBB";

        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);

        // 我们手动转 JSON 格式
        StringBuilder sb = new StringBuilder("[");
        for (Message m : list) {
            sb.append("{");
            sb.append("\"who\":");
            sb.append("\"" + m.who + "\",");
            sb.append("\"target\":");
            sb.append("\"" + m.target + "\",");
            sb.append("\"what\":");
            sb.append("\"" + m.what + "\"");
            sb.append("},");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        resp.getWriter().println(sb.toString());
    }
}
