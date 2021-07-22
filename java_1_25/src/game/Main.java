package game;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Game game = new Game(player);
        while(true){
            game.initialize(); //game初始化
            game.play();      //开始玩游戏
            game.destroy();  //游戏结束
            if(!player.queryContinue()){
                System.out.println("游戏退出");
                break;
            }

        }
    }
}
