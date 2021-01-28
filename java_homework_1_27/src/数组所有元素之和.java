//实现一个方法 sum, 以数组为参数, 求数组所有元素之和
public class 数组所有元素之和 {
    public static void main(String[] args) {
        long[] array = new long[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        long ret = sum(array);
        System.out.println(ret);
    }

    private static long sum(long[] array) {
        long ans = 0;
        for(int i = 0;i < array.length;i++){
            ans += array[i];
        }
        return ans;
    }
}
