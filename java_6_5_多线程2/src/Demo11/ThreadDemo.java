package Demo11;

class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        while (true){
            System.out.println(getName());
            if (getName().equals("张三")){
                //Thread.yield();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("张三");
        MyThread t2 = new MyThread("李四");
        t1.start();
        t2.start();
    }
}
