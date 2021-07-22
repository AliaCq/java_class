package Demo2;

import java.util.concurrent.TimeUnit;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("我是子线程");
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException exc){
                exc.printStackTrace();
            }
        }
    }
}
public class CreateThreadDemo {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();//每个对象是一个任务
        //要使用线程，还需要Thread对象
        //将runnable对象传进去
        Thread thread = new Thread(runnable);
        thread.start();  //就绪状态

        while(true){
            try{
                System.out.println("我是主/父线程");
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException exc){
                exc.printStackTrace();
            }
        }
    }
}
