public class 练习2new {
    public static int indexOf(long[] array,int fromIndex,int toIndex,long target) {
        int i = 0;
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
            throw new RuntimeException("传入的参数不合法");
        }

        for(i=toIndex-1;i>=fromIndex;i--)
        {
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
}
