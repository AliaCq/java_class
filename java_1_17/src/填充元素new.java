public class 填充元素new {
    public static long[] Fill(long[] array,int fromIndex,int toIndex,long k) {
        int i = 0;
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
            throw new RuntimeException("传入的参数不合法");
        }
        for(i=fromIndex;i<toIndex;i++)
        {
            array[i] = k;
        }
        return array;
    }
}
