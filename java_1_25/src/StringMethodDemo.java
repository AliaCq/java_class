public class StringMethodDemo {
    public static void main(String[] args) {
//        String s;
//        String s1;
//        String s2;
//        s = "hello";
//        s1 = "hello"+""+"world";
//
//        s2 = new String();
//        //构造了一个空的字符串
//        //与s=""不同
//
//        char[] a;
//        a = new char[]{'我','是','中','国','人'};
//        String m = new String(a);
//        System.out.println(m);
//
//        m = new String(a,1,2);
//        System.out.println(m);
//        System.out.println(s);
//        String t = new String(s);
//        System.out.println(t);
//        s = "wrold";
//        System.out.println(s);
//        System.out.println(t);

        String s = "我是中国人，我爱中国，我爱我的家乡，我爱我的母校，我爱我的家庭";
        String t = s.substring(25,28);
        System.out.println(t);
        t=s.replace('我','他');
        System.out.println(t);

    }
}