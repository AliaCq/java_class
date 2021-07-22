package 计算fib数;

import java.util.Scanner;
class MyThread extends Thread{
    int n;
    @Override
    public void run() {
        long r = fib(n);
        System.out.printf("fib(%d) = %d\n",n,r);
    }

    public static long fib(int n){
        if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n - 2);
    }
}

public class demo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("请输入要计算的数字");
            int n = s.nextInt();

            MyThread thread = new MyThread();
            //Thread t = new MyThread();

            thread.n = n;
            thread.start();  //就绪的状态
        }
    }
}
