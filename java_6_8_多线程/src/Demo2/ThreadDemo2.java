package Demo2;

import java.util.Scanner;
class lock1{}
class lock2{}

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Object lock1 = new lock1();
        Object lock2 = new lock2();

        Scanner s = new Scanner(System.in);

        synchronized (lock1){
            synchronized (lock2) {
                s.nextLine();  //lock1 & lock2都持有
                System.out.println(1);
                lock2.wait(5_000); //释放了lock2  只持有lock1锁
                //sleep不会上锁
                //Thread.sleep(5_000); //持有lock1 和lock2
                System.out.println(2);
                s.nextLine();//lock1 & lock2都持有
            }
        }
    }
}
