package 排序;

import java.util.Arrays;

public class 希尔排序 {

    //不具有稳定性
    //平均时间复杂度 O(n^1.4~1.5)
    //空间复杂度O(1)
    public static void shellSort(long[] array){
        int group = array.length / 2;
        while (true){
            groupSort(array,group);
            if(group == 1){
                return;
            }
            group = group / 2;
        }
    }

    public static void groupSort(long[] array,int group){
        for(int i = group;i < array.length;i++){
            int j;
            long toInsert = array[i];
            for(j = i - group;j >= 0 && array[j] > toInsert;j -= group){
                array[j+group] = array[j];
            }
            array[j+group] = toInsert;
        }
    }

    public static void main(String[] args) {
        long[] array = {5,7,3,8,12,56,39,0,2,1,8,4,9,13};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
