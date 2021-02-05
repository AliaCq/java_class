package String;

public class String方法charAt和toCharArray和length {
    public static void charAt1(String s) {
        int i = 0;
        for(i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
    private static void charAt2(String s) {
        //s.toCharArray();//Converts this string to a new character array
        char[] array = s.toCharArray();
        int i = 0;
        for(i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        String s = "我爱我的国";
        charAt1(s);
        charAt2(s);
    }
}
