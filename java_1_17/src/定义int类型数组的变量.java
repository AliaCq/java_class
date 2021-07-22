import java.util.Arrays;

public class 定义int类型数组的变量 {
    public static int[] method() {
        int[] arr = {1, 2, 3};
        return arr;
    }
    public static void main(String[] args) {
        int i = 0;
        int[] a = { 1, 2, 3, 4};
        //错误
//        int[] b;
//        b = {1, 2, 3, 4};
        String[] b = new String[]{"hello", "world"}; //初始化
        b = new String[] {"go","come","yes"};  //赋值

        int[] d = new int[5];

        System.out.println(d.length);//5
        //打印数组
        String s = Arrays.toString(a);
        System.out.println(s);// 1, 2, 3, 4

        int[] c = method();
        String m = Arrays.toString(c);
        System.out.println(m); //1, 2, 3

        for(i=0;i<b.length;i++){
            System.out.printf("第%d个元素是%s\n",i+1,b[i]);
        }

        String[] e = new String[]{"hello", "world"};
        for(String n:e){
            System.out.println(n);
        }
    }
}
