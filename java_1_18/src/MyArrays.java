public class MyArrays {
    public static String toString(long[] array) {
        String ans = "[";
        int i=0;
        for(i=0;i<array.length - 1;i++){
            long tmp = array[i];
            ans += tmp + ", ";
        }
        if(array.length > 0){
            long tmp = array[array.length - 1];
            ans += tmp;
        }
        ans += "]";
        return ans;
    }

    public static long[] copyOf(long[] original,int newlength) {
        long[] ans = new long[newlength];
        // 下标(i) 走到哪个位置停下来？
        // original.length 和 ans.length 中小的一个
        int size = Integer.min(original.length,newlength);
        int i = 0;
        for(i = 0;i < size; i++){
            ans[i] = original[i];
        }
        return ans;
    }

    public static long[] copyOfRange(long[] original,int from,int to) {
        if(from < 0 ){
            throw new RuntimeException("from 必须 >= 0");
        }
        if(from > to){
            throw new RuntimeException("from 必须 <= to");
        }
        if(from > original.length){
            throw new RuntimeException("from 必须 <= original.length");
        }

        int newlength = to - from;
        long[] ans = new long[newlength];
        int i = 0;
        // i 假如代表的是 ans 的下标
        // i 的合法取值范围必须满足两个条件
        // 1. i 在 ans 中是合法下标  [0, ans.length)
        // 2. from + i 在 original 中是合法下标 [0, original.length)
        //    i 的取值范围 [-from, original.length - from)
        // 最后，i 的合法范围：[0, ans.length) 和 [-from, original.length - from) 的交集
        // i ~ [0, min(ans.length, original.length - from))
        int size = Integer.min(newlength,original.length-from);
        for(i=0;i<size;i++){
            ans[i] = original[from+i];
        }
        return ans;
    }

    public static void BubleSort(long[] array) {
        int i = 0;
        int j = 0;
        for(i=0;i<array.length - 1;i++) {
            for(j=0;j<array.length-i - 1;j++) {
                if(array[j] > array[j+1]) {
                    long tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    // 待查找区间表示为: [low, high)
    // 带查找区间内的元素个数: high - low
    public static int BinarySearch(long[] array,long target) {
        int low = 0;
        int high = array.length;
        int mid = 0;
        while(high - low > 0){
            mid = (low + high) / 2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] > target){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    // 待查找区间表示为: [low, high]
    public static int BinarySearch2(long[] array,long target) {
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        while(high - low >= 0){
            mid = (low + high) / 2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
