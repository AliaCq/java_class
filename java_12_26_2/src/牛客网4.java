import java.util.Scanner;
//16进制转化为十进制
//public class 牛客网4 {
//    public static void main(String[] args) {
//        Scanner sca = new Scanner(System.in);
//        String hex = sca.next();
//        int len = hex.length();
//        long ans = 0;
//        int i = 0;
//        int j = 0;
//        for(i=0;i<len;i++){
//            char digitChar = hex.charAt(i);
//            int digitInt = 0;
//            if(digitChar >= '0' && digitChar <= '9'){
//                digitInt = digitChar - '0';
//            }
//            else{
//                digitInt = digitChar - 'A' + 10;
//            }
//            long p = 1;
//            for(j=0;j<len-i-1;j++){
//                p = p * 16;
//            }
//            long t = p * digitInt;
//            ans = ans + t;
//        }
//        System.out.println(ans);
//    }
//

public class 牛客网4 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String hex = sca.next();
        int len = hex.length();
        long ans = 0;
        int i = 0;
        int j = 0;
        for(i=0;i<len;i++){
            int digitInt = 0;
            char digitChar = hex.charAt(i);
            long p = 1;
            if(digitChar >= '0' && digitChar <= '9'){
                digitInt = digitChar - '0';
            }
            else{
                digitInt = digitChar - 'A' + 10;
            }
            for(j=0;j<len-i-1;j++){
                p = p * 16;
            }
            long t = p * digitInt;
            ans = ans + t;
        }
        System.out.println(ans);
    }
}