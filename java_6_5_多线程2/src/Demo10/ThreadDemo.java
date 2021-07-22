package Demo10;
class MyThread extends Thread{
    @Override
    public void run() {
        ThreadDemo.printThreadName();
    }
}

public class ThreadDemo {
    public static void printThreadName() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getId()+":"+thread.getName());
    }

    public static void main(String[] args) {
        printThreadName();
        Thread t = new MyThread();
        t.start();
    }
}
