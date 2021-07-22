public class 查找数组最大值 {
    public static long findMax(long[] array) {
        long max = 0;
        int i = 0;
        for(i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
