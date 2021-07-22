package game;
//Game代表完整的一局游戏
//三个功能
//1.initialize  //开始游戏前的准备工作
//2.paly    //游戏主流程
//3.destroy  //游戏结束前的收尾工作

public class Game {
    private final Player player;
    private final Ai ai;
    private final Chessboard chessboard;

    public Game(Player player) {
        this.player = player;
        this.ai = new Ai();
        this.chessboard = new Chessboard();
    }

    public void initialize(){
        System.out.println("欢迎进入井字棋游戏");
        System.out.println("====================");
        System.out.println(chessboard);
    }

    //回合制
    public void play(){
        while(true){
            if(playerTurn()){
                break;
            }
            if(aiTurn()){
                break;
            }
        }
    }

    public void destroy(){
        chessboard.reset();
    }

    private boolean playerTurn(){
        System.out.println("玩家落子");
        while(true){
            int[] rc = player.getRowColumn();
            int row = rc[0];
            int column = rc[1];
            if(chessboard.moveCircleAt(row,column)){
                break;
            }
            System.out.println("该位置已经落子 请重新选择位置");
        }
        System.out.println(chessboard);
        return chessboard.getState() != Chessboard.CONTINUE;
    }
    private boolean aiTurn(){
        System.out.println("AI落子");
        while(true){
            int[] rc = ai.getRowColumn();
            int row = rc[0];
            int column = rc[1];
            if(chessboard.moveCrossAt(row,column)){
                break;
            }
        }
        System.out.println(chessboard);
        return chessboard.getState() != Chessboard.CONTINUE;
    }

}
