public class 查找数组最小值new {
    public static long findMin(long[] array,int fromIndex, int toIndex) {
        int i = 0;
        long min = array[0];
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
            throw new RuntimeException("传入的参数不合法");
        }
        for(i=fromIndex;i<toIndex;i++)
        {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
