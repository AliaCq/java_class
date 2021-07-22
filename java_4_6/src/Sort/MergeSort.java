package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(long[] array){
        mergeSortRange(array,0,array.length);
    }

    private static void mergeSortRange(long[] array, int from, int to) {
        int size = to - from;
        if(size <= 1){
            return;
        }
        int mid = from + (to - from) / 2;

        mergeSortRange(array,from,mid);
        mergeSortRange(array,mid,to);
        merge(array,from,mid,to);
    }

    private static void merge(long[] array, int from, int mid, int to) {
        int size = to - from;
        long[] extra = new long[size];
        int k1 = from;
        int k2 = mid;
        int k3 = 0;
        //两个区间都有元素 选择较小的放进去
        while(k1 < mid && k2 < to){
            if(array[k1] <= array[k2]){
                extra[k3++] = array[k1++];
            }else {
                extra[k3++] = array[k2++];
            }
        }

        if(k1 < mid){
            while (k1 < mid){
                extra[k3++] = array[k1++];
            }
        }else {
            while (k2 < to){
                extra[k3++] = array[k2++];
            }
        }

        for (int i = 0;i < size;i++){
            array[from+i] = extra[i];
        }
    }

    public static void main(String[] args) {
        long[] array = {2,3,5,7,8,9,1,4,6};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
