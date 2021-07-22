import java.util.Arrays;
public class 使用array中的方法 {
    public static void main(String[] args) {
        //testBinarySearch();    //二分查找数字k
        //testEquals();          //判断两个数组是否相等   相等是指元素和数组大小都相等
        //testFill();           //在数组中从下标x到y填充数字m
        //testSort();           //从小到大排序
        //testCopy();           //创建另一个数组 将当前数组中的元素复制过去
    }

    private static void testCopy() {
        long[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        long[] b = Arrays.copyOf(a,3);
        System.out.println(Arrays.toString(b));

        long[] c = Arrays.copyOf(a,5);
        System.out.println(Arrays.toString(c));

        long[] d = Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(d));
    }

    private static void testSort() {
        long[] a = {9, 5, 2, 7, 1, 6, 8, 3, 0};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void testFill() {
        long[] a = new long[10];
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 1, 8, 100);
        System.out.println(Arrays.toString(a));
    }

    private static void testEquals() {
        long[] a = {1, 2, 3, 4};
        long[] b = {1, 2, 3, 0};
        System.out.println(Arrays.equals(a, b));
    }

    private static void testBinarySearch() {
        long[] a = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        //若在无序数组中查找  返回什么值都是正确的
        System.out.println(Arrays.binarySearch(a, 3)); //2
        System.out.println(Arrays.binarySearch(a, 4)); //3 or 4
        System.out.println(Arrays.binarySearch(a, -1)); // 负数
        System.out.println(Arrays.binarySearch(a, 10)); // 负数
    }
}
