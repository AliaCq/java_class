package Demo1;

import java.util.concurrent.TimeUnit;

class MyThread extends Thread{
    @Override
    public void run() {
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (ThreadDemo.o) {
            ThreadDemo.o.notify();
        }
    }
}

public class ThreadDemo {
    static Object o = new Object();

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        System.out.println("准备开始Wait");
        synchronized (o){
            o.wait();
        }
        System.out.println("从wait中醒来");
    }
}
