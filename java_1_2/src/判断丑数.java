import java.util.Scanner;

public class 判断丑数 {
    public static boolean isUgly(int n) {
            if(n <= 0) {
                return false;
            }
            if(n == 1){
                return true;
            }
            while(n % 2 == 0){
                n = n / 2;
                if(n == 1){
                    return true;
                }
            }
            while(n % 3 == 0){
                n = n / 3;
                if(n == 1){
                    return true;
                }
            }
            while(n % 5 == 0){
                n = n / 5;
                if(n == 1){
                    return true;
                }
            }
            return false;
    }
    public static void main(String[] args) {
//        int i = 0;
//        for(i = 0;i <= 50;i++){
//            if(isUgly(i)){
//                System.out.println(i);
//            }
//        }
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        System.out.println(isUgly(a));
    }

}
