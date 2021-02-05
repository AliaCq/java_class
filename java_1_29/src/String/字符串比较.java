package String;

public class 字符串比较 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "hello world";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
    }


}
