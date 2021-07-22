public class 查找最小值 {
    public static long findMin(long[] array) {
        int i = 0;
        long min = array[0];
        for(i=0;i<array.length;i++)
        {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
