package Demo3;

import java.util.concurrent.TimeUnit;
//调用wait的时候其实希望子线程计算一个复杂的数据，算好之后通知主线程并将数据传过来
class MyThread extends Thread{
    @Override
    public void run() {
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (ThreadDemo.class) {
            ThreadDemo.result = 100;
            ThreadDemo.class.notify();
        }
    }
}

public class ThreadDemo {
    static int result = -1;

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        long r = 0;
        synchronized (ThreadDemo.class){
            ThreadDemo.class.wait();
            r = result;
        }
        System.out.println(r);
    }
}
