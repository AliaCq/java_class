package Demo13;

import java.util.concurrent.TimeUnit;

class MyThread extends Thread{
    @Override
    public void run() {
        while (!内存可见性.quit){
        }
    }
}

public class 内存可见性 {
    //volatile脆弱的 告诉gvm不要随便优化
    volatile static boolean quit = false;

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        quit = true;
    }
}