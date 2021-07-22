package Demo2;

class Add extends Thread{
    @Override
    public void run() {
        synchronized (Add.class) {
            for (long i = 0; i < 100_0000_0000L; i++) {
                ThreadDemo.n++;
            }
        }
    }
}

class Sub extends Thread{
    @Override
    public void run() {
        synchronized (Add.class) {
            for (long i = 0; i < 100_0000_0000L; i++) {
                ThreadDemo.n--;
            }
        }
    }
}

public class ThreadDemo {
    static int n = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Add();
        Thread b = new Sub();
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(n);
    }
}
