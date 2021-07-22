import model.Message;

import java.util.ArrayList;
import java.util.List;

public class ToJsonDemo1 {
    public static void main(String[] args) {
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

        //手动拼接json格式的消息
        StringBuilder s = new StringBuilder("[");
        for (Message m:list) {
            s.append("{");
            s.append("\"who\":");
            s.append("\""+m.who+"\",");
            s.append("\"target\":");
            s.append("\""+m.target+"\",");
            s.append("\"what\":");
            s.append("\""+m.what+"\",");
            s.append("},");
        }
        s.deleteCharAt(s.length()-1);
        s.append("]");
        //打印出来的就是最标准的json格式
        System.out.println(s.toString());
    }
}
