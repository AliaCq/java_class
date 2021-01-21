import java.util.Scanner;
//将一个秒数转化为时分秒
public class 牛客网2 {
    public static void main (String[] args) {
        Scanner sca = new Scanner(System.in);
        int seconds = sca.nextInt();
        int sec = seconds % 60;
        int min = (seconds / 60) % 60;
        int hour = (seconds / 60) / 60;
        System.out.printf("%d %d %d\n",hour,min,sec);
    }
}
