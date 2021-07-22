package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(long[] array){
        quickSortRange(array,0,array.length-1);
    }

    private static void quickSortRange(long[] array, int from, int to) {
        int size = to - from + 1;

        if(size <= 1){
            return;
        }

        int pivotIdx = partition(array,from,to);
        quickSortRange(array,0,pivotIdx-1);
        quickSortRange(array,pivotIdx+1,to);
    }

    private static int partition(long[] array, int from, int to) {
        int left = from;
        int right = to;
        long pivot = array[from];
        while (left < right){
            while (left < right && array[right] >= pivot){
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= pivot){
                left++;
            }
            array[right] = array[left];
        }
        array[left] = pivot;
        return left;
    }

    public static void main(String[] args) {
        long[] array = {2,3,5,7,8,9,1,4,6};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
