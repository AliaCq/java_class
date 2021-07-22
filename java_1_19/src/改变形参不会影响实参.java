import java.util.Arrays;

public class 改变形参不会影响实参 {
    public static void main(String[] args) {
        long a =10;
        long b = 20;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);

        long[] c = {1, 2, 3, 4};
        long[] d = {100, 200, 300, 400};
        swap1(c,d);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        long[] e = {1, 2, 3, 4};
        System.out.println(Arrays.toString(e));
        swap2(e,0,3);
        System.out.println(Arrays.toString(e));
    }

    private static void swap2(long[] e, int x, int y) {
        long t = e[x];
        e[x] = e[y];
        e[y] = t;
    }

    private static void swap1(long[] x, long[] y) {
        long[] t = x;
        x = y;
        y = t;
    }

    private static void swap(long x, long y) {
        long tmp = x;
        x = y;
        y = tmp;
    }
}
