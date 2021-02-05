package String;

public class String方法indexOf以及lastIndexOf {
    public static void main(String[] args) {
        String s = "我爱我的国，我爱我的家";
        System.out.println(s.indexOf('它'));
        System.out.println(s.indexOf("我爱"));
        System.out.println(s.indexOf('我'));
        s.indexOf('我',9);

        System.out.println(s.lastIndexOf('它'));
        System.out.println(s.lastIndexOf("我爱"));
        System.out.println(s.lastIndexOf('我'));
        System.out.println(s.lastIndexOf('国',2));
    }
}
