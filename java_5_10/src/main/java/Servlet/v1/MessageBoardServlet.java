package Servlet.v1;

import model.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/v1/message-board")
public class MessageBoardServlet extends HttpServlet {
    private List<Message> messageList = new ArrayList<>();

    {
        Message m1 = new Message();
        m1.who = "A";
        m1.target = "B";
        m1.what = "C";

        Message m2 = new Message();
        m2.who = "甲";
        m2.target = "乙";
        m2.what = "丙";

        messageList.add(m1);
        messageList.add(m2);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        output(resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //读取用户输入的参数
        //返回值是null时，用户没有提交信息
        String who = req.getParameter("who");
        String target = req.getParameter("target");
        String what = req.getParameter("what");
        System.out.println("who:"+who);
        System.out.println("target:"+target);
        System.out.println("what:"+what);

        if (who != null && target != null && what != null){
            //把用户的输入封装成对象
            Message msg = new Message();
            msg.who = who;
            msg.target = target;
            msg.what = what;
            //保存message
            messageList.add(msg);
        }

        output(resp);
    }

    private void output(HttpServletResponse resp) throws IOException {
        String html1 = "<!DOCTYPE html>\n" +
                "<html lang=\"zh-hans\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title>留言板</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <form method=\"post\" action=\"/v1/message-board\">\n" +
                "    <label for=\"who\">谁</label><input type=\"text\" id=\"who\" name=\"who\">\n" +
                "    <label for=\"target\">向谁</label><input type=\"text\" id=\"target\" name=\"target\">\n" +
                "    <label for=\"what\">说什么</label><input type=\"text\" id=\"what\" name=\"what\">\n" +
                "    <button type=\"submit\">提交</button>\n" +
                "  </form>\n" +
                "\n" +
                "  <table>\n" +
                "    <thead>\n" +
                "      <tr>\n" +
                "        <th>谁</th>\n" +
                "        <th>向谁</th>\n" +
                "        <th>说什么</th>\n" +
                "      </tr>\n" +
                "    </thead>\n" +
                "    <tbody>";
        String html2 = "</tbody>\n" +
                "  </table>\n" +
                "</body>\n" +
                "</html>";

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();
        writer.print(html1);
        for (Message message : messageList) {
            writer.printf("<tr><td>%s</td><td>%s</td><td>%s</td></tr>", message.who, message.target, message.what);
        }
        writer.print(html2);
    }
}
