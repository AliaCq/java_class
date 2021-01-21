import java.util.Random;
import java.util.Scanner;

public class 猜数字游戏 {

    public static void main(String[] args) {
        int level = selectLevel();//获取难度
        int range = getRandomRange(level);//获取最大随机数
        int toGuessCount = getToGuessCount(level);//获取猜数字次数
        int random = generateRandom(range);//获取随机数

        playGame(random,toGuessCount);//玩游戏
    }

    public static void playGame(int random, int toGuessCount) {
        Scanner sca = new Scanner(System.in);
        int count = 0;
        System.out.print("请猜数字:");
        while(sca.hasNext() && count < toGuessCount){
            int n = sca.nextInt();
            count++;
            if(n == random){
                System.out.println("成功");
                break;
            }
            else if(n < random){
                System.out.printf("猜小了，还有%d次机会\n",toGuessCount - count);
            }
            else{
                System.out.printf("猜大了，还有%d次机会\n",toGuessCount - count);
            }
            System.out.print("请猜数字:");
        }
    }

    public static int generateRandom(int range) {
        Random random = new Random();
        return random.nextInt(range);
    }

    public static int getToGuessCount(int level) {
        switch(level){
            case 0:
                return 10;
            case 1:
                return 7;
            case 2:
                return 5;
            default:
                return 10;
        }
    }

    public static int getRandomRange(int level) {
        switch(level){
            case 0:
                return 10;
            case 1:
                return 100;
            case 2:
                return 1000;
            default:
                return 10;
        }
    }

    public static int selectLevel() {
        Scanner sca = new Scanner(System.in);
        System.out.print("请选择难度0/1/2：");
        return sca.nextInt();
    }
}
