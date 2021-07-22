public class 求数组和 {
    public static long Sum(long[] array) {
        int i = 0;
        long sum = 0;
        for(i=0;i<array.length;i++)
        {
            sum += array[i];
        }
        return sum;
    }
}
