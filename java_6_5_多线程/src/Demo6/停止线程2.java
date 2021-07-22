package Demo6;

import java.util.concurrent.TimeUnit;

class MyThread extends Thread{
    @Override
    public void run() {
        while(!Thread.interrupted()){
            try{
                System.out.println("我是子线程");
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException exc){
                exc.printStackTrace();
                break;
            }
        }
    }
}
public class 停止线程2 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        //Thread t = new MyThread();

        thread.start();  //就绪的状态

        for (int i = 0;i < 10;i++){
            try{
                System.out.println("我是主/父线程");
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException exc){
                exc.printStackTrace();
            }
        }
        thread.interrupt();
    }
}
