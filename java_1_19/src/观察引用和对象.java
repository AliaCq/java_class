import java.util.Arrays;

public class 观察引用和对象 {
    public static void main(String[] args) {
        //long[][] a = new long[5][];
        //a[0][0] = 1;
        //System.out.println(a[0][0]); //异常
//        long[] e = a[0];
//        System.out.println(e);
//        e[0] = 1;  //异常

//        int[][] a = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
//        print二维数组(a);
//
//        int[] t = a[2];
//        a[2] = a[3];
//        a[3] = t;
//
//        print二维数组(a);
    }

    private static void print二维数组(int[][] a) {
        //方法一：
        int i = 0;
        int j = 0;
        if(a == null){
            System.out.printf("null");
            return;
        }
        for(i = 0;i< a.length;i++)
        {
            if(a[i] == null){
                System.out.printf("null");
                continue;
            }
            for(j=0;j<a[i].length;j++)
            {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        //方法2：
        int k = 0;
        if(a == null){
            System.out.printf("null");
           return;
        }
        for(k=0;k<a.length;k++){
            System.out.println(Arrays.toString(a[i]));
        }
        //方法3：
        System.out.println(Arrays.deepToString(a));

    }
}
