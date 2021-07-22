import java.util.Arrays;

public class 测试 {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();
    }

    private static void test4() {
        long[] a = new long[10];
        long[] b = new long[10];
        填充元素.Fill(a, 2);
        System.out.println(Arrays.toString(a));
        填充元素new.Fill(b,2,6,4);
        System.out.println(Arrays.toString(b));
    }

    private static void test3() {
        long[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(求数组和.Sum(a));
        System.out.println(数组求和new.Sum(a, 0, 5));
    }

    private static void test2() {
        long[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(查找数组最大值.findMax(a));
        System.out.println(查找最小值.findMin(a));
        System.out.println(查找数组最大值new.findMax(a, 0, 5));
        System.out.println(查找数组最小值new.findMin(a, 0, 4));
    }

    private static void test1() {
        long[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(练习1.indexOf(a, 3));
        System.out.println(练习1.indexOf(a, 11));
        System.out.println(练习1new.indexOf(a, 1, 5, 6));
        System.out.println(练习1new.indexOf(a, 1, 5, 2));

        System.out.println(练习2.indexOf(a, 3));
        System.out.println(练习2.indexOf(a, 11));
        System.out.println(练习2new.indexOf(a, 1, 5, 6));
        System.out.println(练习2new.indexOf(a, 1, 5, 2));
    }
}
