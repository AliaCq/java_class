import java.util.Scanner;

public class 作业1 {
        public static void main(String[] args) {
            //统计偶数位1的个数  和奇数位1的个数
            Scanner sca = new Scanner(System.in);
            while(sca.hasNext()){
                int n = sca.nextInt();
                int count0 = 0;
                int count1 = 0;
                int i = 0;
                for(i=0;i<32;i++){
                    if((n&(1<<i)) != 0){
                        if(i%2==0){
                            count0++;
                        }
                        else{
                            count1++;
                        }
                    }
                }
                System.out.println(count0);//偶数位个数
                System.out.println(count1);//奇数位个数
            }
        }
}
