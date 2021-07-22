package Demo1;

import java.util.concurrent.TimeUnit;
//下面有两个死循环但是多线程就可以实现,各自循环各自的
//MyThread对象代表一个对象  只是用来创建线程
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
        //Thread t = new MyThread();

        thread.start();  //就绪的状态

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
