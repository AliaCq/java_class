import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class url编码解码 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好世界";
        String encode = URLEncoder.encode(s,"UTF-8");
        System.out.println(encode);

        String d = "%E4%BD%A0%E5%A5%BD%E4%B8%96%E7%95%8C";
        String decode = URLDecoder.decode(d,"UTF-8");
        System.out.println(decode);
    }
}
