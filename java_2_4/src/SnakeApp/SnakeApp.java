package SnakeApp;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SnakeApp extends Application {
//        private static int x;//绘制圆的x
//        private static int y;//绘制圆的y
//
//    static class MyTimer extends AnimationTimer {
//        private long lastTick = 0;
//        private Canvas canvas;
//        private GraphicsContext gc;
//
//        MyTimer(Canvas canvas, GraphicsContext gc) {
//            this.canvas = canvas;
//            this.gc = gc;
//        }
//
//        @Override
//        public void handle(long now) {
//            //now以纳秒为单位 本次调用handle的时间
//            //1e9 = 1*10^9; 1秒一下
////            if(lastTick == 0 || (now - lastTick) > 1e9){
////                lastTick = now;
////                System.out.println("hello");
////            }
//            if(lastTick == 0 || (now - lastTick) > 1e9 / 48){
//                lastTick = now;
//                //绘制大的图形 将之前绘制的图形擦掉
//                gc.setFill(Color.YELLOW);
//                gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
//
//                //绘制圆形
//                gc.setFill(Color.RED);
//                gc.fillOval(x,y,50,50);
//                x++;
//                y++;
//            }
//        }
//    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final Canvas canvas = new Canvas(800,600);
        Pane pane = new Pane();
        pane.getChildren().add(canvas);

        //在画布上进行图形绘制
        final GraphicsContext gc = canvas.getGraphicsContext2D();
        //1.填充式的 设置颜色
        //2.不填充 设置颜色

        //先绘制矩形
        //1.填充式的 设置颜色
        gc.setFill(Color.RED);
        gc.fillRect(400,60,120,80);

        //2.不填充 设置颜色
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeRect(400,60,120,80);

        //绘制圆形
        gc.setFill(Color.LIGHTGREEN);
        gc.fillRect(100,200,80,80);
        //绘制结束

        //AnimationTimer timer = new MyTimer(canvas,gc);
        //timer.start();

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("贪吃蛇");
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(SnakeApp.class,args);
        launch(args);
    }
}
