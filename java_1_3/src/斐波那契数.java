import java.util.Scanner;
//求斐波那契数列的第n项。(迭代实现)
public class 斐波那契数<n> {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();;
        int[] arr = {1,1};
        int i = 0;
        int ans = 0;
        if(n<=2){
            ans = 1;
        }
        if(n>=3){
            for(i = 3;i<=n;i++){
                ans = arr[0] + arr[1];
                arr[0] = arr[1];
                arr[1] = ans;
            }
        }
        System.out.println(ans);
    }
}
