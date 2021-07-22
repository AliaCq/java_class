package Demo3;

import java.util.concurrent.TimeUnit;

class MyThread extends Thread{
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
        MyThread thread = new MyThread();
        Thread t = new Thread(thread);
        t.start();  //就绪的状态
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
