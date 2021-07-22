package Demo9;
//耗时：54.4760 s
public class ThreadDemo {
    public static void main(String[] args) {
        //计算1+2+3+...+...
        //这个计算持续10次
        //计算耗时时间
        long b = System.currentTimeMillis();
        for (int i = 0;i < 10;i++){
            long r = 0;
            for (long j = 0;j < 100_0000_0000L;j++){
                r += j;
            }
            System.out.println("计算结果");
        }
        long e = System.currentTimeMillis();
        double t = (e - b) / 1000.0;
        System.out.printf("耗时：%.4f s",t);
    }
}
