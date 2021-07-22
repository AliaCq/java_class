import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main3 {
    public static void main(String[] args) throws JsonProcessingException {
        Object object = getObject();
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writer().withDefaultPrettyPrinter().writeValueAsString(object);
        System.out.println(s);
    }

    public static Object getObject() {
        Article article = new Article();
        article.id = 1;
        article.title = "Java的序列化和发序列化";

        return article;
    }
}
