public class 填充元素 {
    public static long[] Fill(long[] array,long k) {
        int i = 0;
        for(i=0;i<array.length;i++)
        {
            array[i] = k;
        }
        return array;
    }
}
