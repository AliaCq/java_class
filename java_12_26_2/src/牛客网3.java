import java.util.Scanner;
//获取一个字符串 将第一个字符转化为ASCII码
public class 牛客网3 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String word = sca.next();
        char ch = word.charAt(0);
        System.out.println((int)ch);
    }
}
