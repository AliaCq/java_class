package Demo9;
//耗时：15.7880 s
class MyThread extends Thread{
    @Override
    public void run() {
        long r = 0;
        for (long j = 0;j < 100_0000_0000L;j++){
            r += j;
        }
        System.out.println("计算结果");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        //计算1+2+3+...+999999
        //这个计算持续10次
        //计算耗时时间
        //自己算一遍 等待其他线程算完
        //创建9个线程
        long b = System.currentTimeMillis();
        MyThread[] threads = new MyThread[9];

        for (int i = 0;i < 9;i++){
            threads[i] = new MyThread();
            threads[i].start();
        }

        long r = 0;
        for (long j = 0;j < 100_0000_0000L;j++){
            r += j;
        }
        System.out.println("计算结果");

        for (int i = 0;i < 9;i++){
            threads[i].join();
        }

        long e = System.currentTimeMillis();
        double t = (e - b) / 1000.0;
        System.out.printf("耗时：%.4f s",t);
    }
}
