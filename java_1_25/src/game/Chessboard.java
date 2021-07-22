package game;

import sun.security.krb5.internal.PAForUserEnc;

import java.util.Arrays;

//Chessboard用来实例化对象
//棋盘对象
//1.落子
//2.判断棋盘状态
public class Chessboard {
    private static final int k = 0;
    private static final int o = 1;
    private static final int x = 2;
    private final int[][] array ={
            {k,k,k},
            {k,k,k},
            {k,k,k},
    };

    public boolean moveCircleAt(int row,int column){
        if(array[row][column] != k){
            return false;
        }
        array[row][column] = o;
        return true;
    }

    public boolean moveCrossAt(int row,int column){
        if(array[row][column] != k){
            return false;
        }
        array[row][column] = x;
        return true;
    }

    public static final int CIRCLE_WIN = 0; //玩家赢
    public static final int CROSS_WIN = 1;
    public static final int DRAW = 2;      //平局
    public static final int CONTINUE = 3;   //继续

    public int getState(){
        //行
        int i = 0;
        int j = 0;
        for(i=0;i<3;i++){
            if(array[i][0] == array[i][1] && array[i][1] == array[i][2]){
                if(array[i][0] == o){
                    System.out.println("恭喜你赢了");
                    return CIRCLE_WIN;
                }else if(array[i][0] == x){
                    return CROSS_WIN;
                }
            }
        }

        //列
        for(i=0;i<3;i++){
            if(array[0][i] == array[1][i] && array[1][i] == array[2][i]){
                if(array[0][i] == o){
                    System.out.println("恭喜你赢了");
                    return CIRCLE_WIN;
                }else if(array[0][i] == x){
                    return CROSS_WIN;
                }
            }
        }

        //斜线
        if(array[0][0] == array[1][1] && array[1][1] == array[2][2]){
            if(array[1][1] == o){
                System.out.println("恭喜你赢了");
                return CIRCLE_WIN;
            }else if(array[1][1] == x){
                return CROSS_WIN;
            }
        }
        if(array[0][2] == array[1][1] && array[1][1] == array[2][0]){
            if(array[1][1] == o){
                System.out.println("恭喜你赢了");
                return CIRCLE_WIN;
            }else if(array[1][1] == x){
                return CROSS_WIN;
            }
        }

        //没人获胜
        for(i = 0;i<3;i++){
            for(j = 0;j<3;j++){
                if(array[i][j] == k){
                    return CONTINUE;
                }
            }
        }
        return DRAW;
    }

    public void reset (){
        int i = 0;
        int j = 0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                array[i][j] = k;
            }
        }
    }

    private static String disPlay(int i){
        switch(i){
            case k:return " ";
            case o:return "o";
            case x:return "x";
            default:return " ";
        }
    }

    @Override
    public String toString() {
        String s = "=====\n";
        int i = 0;
        for(i = 0;i<3;i++){
            s += String.format("%s %s %s\n",disPlay(array[i][0]),disPlay(array[i][1]),disPlay(array[i][2]));
        }
        s += "=====";
        return s;
    }
}
