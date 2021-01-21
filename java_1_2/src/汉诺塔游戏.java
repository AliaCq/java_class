public class 汉诺塔游戏 {
    public static int count;
    public static void solve(int n,int from,int to) {
        count++;
        if(n==1)
        {
            System.out.printf("从%d移动到%d\n",from,to);
            return;
        }
        int other = 3 - from - to;
        solve(n-1,from,other);
        System.out.printf("从%d移动到%d\n",from,to);
        solve(n-1,other,to);
    }
    public static void main(String[] args) {
        count = 0;
        solve(4,0,2);
        System.out.println(count);
    }
}
