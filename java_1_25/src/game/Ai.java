package game;

import java.util.Random;

//生成落子的位置
public class Ai {
    private final Random random = new Random();
    public int[] getRowColumn(){
        int r = random.nextInt(3);
        int c = random.nextInt(3);
        return new int[]{r,c};
    }
}
