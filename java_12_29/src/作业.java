import java.util.Scanner;

public class 作业 {
    public static void main(String[] args) {
        //统计二进制1的个数
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int n = sca.nextInt();
            int count = 0;
            int i = 0;
            for(i=0;i<32;i++){
                if((n&(1<<i)) != 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

