public class 作业3 {
    public static void main(String[] args) {
        int n = 0;
        int i = 0;
        for(i = 100;i<=999;i++){
            n = i;
            int sum = 0;
            while(n !=0){
                int d = n % 10;
                n = n / 10;
                sum = sum + d * d * d;
            }
            if(sum == i)
                System.out.printf("%d 是水仙花数\n",i);
        }
    }
}
