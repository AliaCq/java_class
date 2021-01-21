import java.util.Scanner;

public class 十进制转7进制 {
    public static String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        boolean sign = true;
        if(num < 0){
            sign = false;
            num = -num;
        }
        String ans = "";

        while(num > 0){
            int d = num % 7;
            ans = d + ans;
            num = num / 7;
        }
        if(!sign){
            ans = "-" + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        String ret = convertToBase7(a);
        System.out.println(ret);
    }
}
