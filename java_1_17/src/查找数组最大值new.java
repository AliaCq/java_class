public class 查找数组最大值new {
    public static long findMax(long[] array,int fromIndex, int toIndex) {
        long max = 0;
        int i = 0;
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
            throw new RuntimeException("传入的参数不合法");
        }
        for(i=fromIndex;i<toIndex;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
