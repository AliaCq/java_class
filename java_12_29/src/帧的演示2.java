public class 帧的演示2 {
    public static void main(String[] args) {
        a(10);
    }

    //递归
    private static void a(int i) {
        if(i==0)
            return;
        a(i-1);
    }
}
