package game;

import java.util.Scanner;

//生成落子的坐标
//询问是否进行新一局游戏
public class Player {
    private final Scanner scanner = new Scanner(System.in);

    public int[] getRowColumn(){
        System.out.println("请输入要落子的位置 行 列，有效范围为[0,1,2]");
        int r = 0;
        int c = 0;
        while(true){
            System.out.println(">>>");
            r = scanner.nextInt();
            c = scanner.nextInt();
            if(r >= 0 && r <= 2 && c >= 0 && c <= 2){
                break;
            }
            System.out.println("有效范围为[0,1,2]，请重新输入");
        }
        return new int[]{r,c};
    }

    public boolean queryContinue(){
        System.out.println("是否进行新一局游戏? true/false");
        System.out.print(">>>");
        return scanner.nextBoolean();
    }
}
