package Demo5;

import java.util.concurrent.TimeUnit;
//下面有两个死循环但是多线程就可以实现,各自循环各自的
//MyThread对象代表一个对象  只是用来创建线程
class MyThread extends Thread{
    boolean condition = true;
    @Override
    public void run() {
        while(condition){
            try{
                System.out.println("我是子线程");
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException exc){
                exc.printStackTrace();
            }
        }
    }
}

public class 停止线程 {
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
       thread.condition = false;
    }
}
