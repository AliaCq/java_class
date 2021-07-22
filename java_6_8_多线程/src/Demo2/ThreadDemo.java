package Demo2;

import java.util.Scanner;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        synchronized (s){
            s.nextLine();
            System.out.println(1);
            s.wait(5_000);
            System.out.println(2);
            s.nextLine();
            System.out.println(3);

        }
    }
}
