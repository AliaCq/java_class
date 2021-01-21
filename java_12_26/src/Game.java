import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int bound=0;
        int guesscount=0;
        int level=0;
        System.out.println("请选择难度0/1/2");
        level=sca.nextInt();
        switch(level){
            case 0:
                bound=10;
                guesscount=10;
                break;
            case 1:
                bound=100;
                guesscount=7;
                break;
            case 2:
                bound=10000;
                guesscount=5;
                break;
            default:
                bound=10;
                guesscount=10;
                break;
        }
        Random rnd=new Random();
        int r=rnd.nextInt(bound);//r是随机生成的数字
        int count=0;
        System.out.println("请猜数字");
        while(sca.hasNextInt() && count<guesscount){
            int n=sca.nextInt();
            if(n==r){
                break;
            }
            else if(n<r){
                System.out.println("小了");
            }
            else{
                System.out.println("大了");
            }
            count++;
        }
        System.out.println("奖励小红花");
    }
}