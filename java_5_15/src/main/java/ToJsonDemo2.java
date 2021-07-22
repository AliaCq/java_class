import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Message;

import java.util.ArrayList;
import java.util.List;

public class ToJsonDemo2 {
    public static void main(String[] args) throws JsonProcessingException {
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

        ObjectMapper objectmapper = new ObjectMapper();
        String s = objectmapper.writeValueAsString(list);
        System.out.println(s);
    }
}
