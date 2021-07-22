package 排序;
import java.util.Arrays;

public class 快速排序 {
    public static void quickSort(long[] array){
        quickSortRange(array,0,array.length - 1);//左闭右闭
    }

    private static void quickSortRange(long[] array,int from,int to){
        int size = to - from + 1;

        //直到size<=1返回
        if (size <= 1){
            return;
        }

        //1.选择基准值
        //2.做partition 返回基准值的下标
        int pivotIdx = partition(array,from,to);
        //3.分别处理左右小区间
        quickSortRange(array,from,pivotIdx-1);
        quickSortRange(array,pivotIdx+1,to);
    }

    public static int partition(long[] array,int from,int to){
        long pivot = array[from];
        int left = from;
        int right = to;

        while(left < right){
            while (left < right && array[right] >= pivot){
                right--;
            }

            while (left < right && array[left] <= pivot){
                left++;
            }
            swap(array,left,right);
        }

        swap(array,from,left);
        return left;
    }

    public static int partition2(long[] array,int from,int to){
        long pivot = array[from];
        int left = from;
        int right = to;

        while(left < right){
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

    public static int partition3(long[] array,int from,int to){
        long pivot = array[from];
        int d = from + 1;
        for(int i = from + 1;i <= to;i++){
            if(array[i] < pivot){
                swap(array,i,d);
                d++;
            }
        }
        swap(array,from,d-1);
        return d-1;
    }

    public static void swap(long[] array,int i,int k){
        long t = array[i];
        array[i] = array[k];
        array[k] = t;
    }

    public static void main(String[] args) {
        long[] array = {5,9,2,7,3,6,8,4,0};
        partition3(array,0,8);
        System.out.println(Arrays.toString(array));
    }
}
