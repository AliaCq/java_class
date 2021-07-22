package Demo12;

class Add extends Thread{
    @Override
    public void run() {
        for(long i = 0; i < 100_0000_0000L;i++){
            ThreadSafety.n++;
        }
    }
}

class Sub extends Thread{
    @Override
    public void run() {
        for(long i = 0; i < 100_0000_0000L;i++){
            ThreadSafety.n--;
        }
    }
}

public class ThreadSafety {
    static long n = 0;
    public static void main(String[] args) throws InterruptedException {
        Add add = new Add();
        Sub sub = new Sub();

        add.start();
        sub.start();

        add.join();
        sub.join();
        System.out.println(ThreadSafety.n);
    }
}
