import java.util.Arrays;

//给定两个整型数组, 交换两个数组的内容
public class 交换两个数组 {
    public static void main(String[] args) {
        long[] arr = new long[] {1, 2, 3, 4, 5};
        long[] arr1 = new long[] {100, 200, 300, 400};
        long[] t =arr;
        System.out.println("交换前");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        arr = arr1;
        arr1 = t;
        System.out.println("交换后");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
