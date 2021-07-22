package 排序;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    //最好：时间复杂度：O(n)
    //最坏时间复杂度：O(n*n)
    //空间复杂度O(1)
    //具备稳定性
    public static void bubbleSort(long[] array){//n个数
        for(int i = 0; i < array.length - 1;i++){//执行n-1次冒泡过程
            boolean sorted = true;
            for(int j = 0;j < array.length - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    swap(array,j,j+1);
                    sorted = false;
                }
            }
            if (sorted){
                return;
            }
        }
    }

    //时间复杂度O(n*n)
    //空间复杂度O(1)
    //不具备稳定性
    public static void selectSort(long[] array){
        for(int i = 0;i < array.length - 1;i++){
            int maxIndex = -1;
            //找到最大元素的下标
            for(int j = 0;j < array.length - i;j++){
                if(maxIndex == -1 ||  array[j] > array[maxIndex]){
                    maxIndex = j;
                }
            }
            swap(array,maxIndex,array.length-1-i);
        }
    }

    //最好：时间复杂度：O(n)
    //最坏时间复杂度：O(n*n)
    //空间复杂度O(1)
    //具备稳定性
    public static void insertSort(long[] array){
        for(int i = 1;i < array.length; i++){
            long toInsert = array[i];
            int j;
            for(j = i - 1;j >= 0 && toInsert < array[j];j--){
                array[j+1] = array[j];
            }
            array[j+1] = toInsert;
        }
    }

    public static void swap(long[] array,int i,int k){
        long t = array[i];
        array[i] = array[k];
        array[k] = t;
    }

    private static Random random = new Random(20210404);

    private static long[] buildReversedArray(int size){
        long[] array = buildSortedArray(size);
        for(int i = 0;i < size/2;i++){
            swap(array,i,size-1-i);
        }
        return array;
    }

    private static long[] buildSortedArray(int size) {
        long[] array = buildRandomArray(size);
        Arrays.sort(array);
        return array;
    }

    private static long[] buildRandomArray(int size) {
        long[] array = new long[size];
        for (int i = 0;i < size;i++){
            array[i] = random.nextInt(2*size);
        }
        return array;
    }

    //顺序数组测试时间
    public static void main4(String[] args) {
        for (int i = 0;i < 10;i++){
            long[] notUsed = buildRandomArray(10000);
            insertSort(notUsed);
            selectSort(notUsed);
            bubbleSort(notUsed);
        }

        //真正测试时间
        long[] array1 = buildSortedArray(5_0000);
        long[] array2 = buildSortedArray(10_0000);
        long[] array3 = buildSortedArray(20_0000);

        long start1 = System.currentTimeMillis();
        bubbleSort(array1);
        long end1 = System.currentTimeMillis();
        double s1 = (end1 - start1) / 1000.0;
        System.out.println(s1);

        long start2 = System.currentTimeMillis();
        bubbleSort(array2);
        long end2 = System.currentTimeMillis();
        double s2 = (end2 - start2) / 1000.0;
        System.out.println(s2);

        long start3 = System.currentTimeMillis();
        bubbleSort(array3);
        long end3 = System.currentTimeMillis();
        double s3 = (end3 - start3) / 1000.0;
        System.out.println(s3);

        long start4 = System.currentTimeMillis();
        selectSort(array1);
        long end4 = System.currentTimeMillis();
        double s4 = (end4 - start4) / 1000.0;
        System.out.println(s4);

        long start5 = System.currentTimeMillis();
        selectSort(array2);
        long end5 = System.currentTimeMillis();
        double s5 = (end5 - start5) / 1000.0;
        System.out.println(s2);

        long start6 = System.currentTimeMillis();
        selectSort(array3);
        long end6 = System.currentTimeMillis();
        double s6 = (end6 - start6) / 1000.0;
        System.out.println(s6);

        long start7 = System.currentTimeMillis();
        insertSort(array1);
        long end7 = System.currentTimeMillis();
        double s7 = (end7 - start7) / 1000.0;
        System.out.println(s7);

        long start8 = System.currentTimeMillis();
        insertSort(array2);
        long end8 = System.currentTimeMillis();
        double s8 = (end8 - start8) / 1000.0;
        System.out.println(s8);

        long start9 = System.currentTimeMillis();
        insertSort(array3);
        long end9 = System.currentTimeMillis();
        double s9 = (end9 - start9) / 1000.0;
        System.out.println(s9);
    }

    //逆序数组测试时间
    public static void main3(String[] args) {
        for (int i = 0;i < 10;i++){
            long[] notUsed = buildRandomArray(10000);
            insertSort(notUsed);
            selectSort(notUsed);
            bubbleSort(notUsed);
        }

        //真正测试时间
        long[] array1 = buildReversedArray(5_0000);
        long[] array2 = buildReversedArray(10_0000);
        long[] array3 = buildReversedArray(20_0000);

        long start1 = System.currentTimeMillis();
        bubbleSort(array1);
        long end1 = System.currentTimeMillis();
        double s1 = (end1 - start1) / 1000.0;
        System.out.println(s1);

        long start2 = System.currentTimeMillis();
        bubbleSort(array2);
        long end2 = System.currentTimeMillis();
        double s2 = (end2 - start2) / 1000.0;
        System.out.println(s2);

        long start3 = System.currentTimeMillis();
        bubbleSort(array3);
        long end3 = System.currentTimeMillis();
        double s3 = (end3 - start3) / 1000.0;
        System.out.println(s3);

        long start4 = System.currentTimeMillis();
        selectSort(array1);
        long end4 = System.currentTimeMillis();
        double s4 = (end4 - start4) / 1000.0;
        System.out.println(s4);

        long start5 = System.currentTimeMillis();
        selectSort(array2);
        long end5 = System.currentTimeMillis();
        double s5 = (end5 - start5) / 1000.0;
        System.out.println(s2);

        long start6 = System.currentTimeMillis();
        selectSort(array3);
        long end6 = System.currentTimeMillis();
        double s6 = (end6 - start6) / 1000.0;
        System.out.println(s6);

        long start7 = System.currentTimeMillis();
        insertSort(array1);
        long end7 = System.currentTimeMillis();
        double s7 = (end7 - start7) / 1000.0;
        System.out.println(s7);

        long start8 = System.currentTimeMillis();
        insertSort(array2);
        long end8 = System.currentTimeMillis();
        double s8 = (end8 - start8) / 1000.0;
        System.out.println(s8);

        long start9 = System.currentTimeMillis();
        insertSort(array3);
        long end9 = System.currentTimeMillis();
        double s9 = (end9 - start9) / 1000.0;
        System.out.println(s9);
    }

    //随机数组测试时间
    public static void main2(String[] args) {
        for (int i = 0;i < 10;i++){
            long[] notUsed = buildRandomArray(10000);
            insertSort(notUsed);
            selectSort(notUsed);
            bubbleSort(notUsed);
        }

        //真正测试时间
        long[] array1 = buildRandomArray(5_0000);
        long[] array2 = buildRandomArray(10_0000);
        long[] array3 = buildRandomArray(20_0000);

        long start1 = System.currentTimeMillis();
        bubbleSort(array1);
        long end1 = System.currentTimeMillis();
        double s1 = (end1 - start1) / 1000.0;
        System.out.println(s1);

        long start2 = System.currentTimeMillis();
        bubbleSort(array2);
        long end2 = System.currentTimeMillis();
        double s2 = (end2 - start2) / 1000.0;
        System.out.println(s2);

        long start3 = System.currentTimeMillis();
        bubbleSort(array3);
        long end3 = System.currentTimeMillis();
        double s3 = (end3 - start3) / 1000.0;
        System.out.println(s3);

        long start4 = System.currentTimeMillis();
        selectSort(array1);
        long end4 = System.currentTimeMillis();
        double s4 = (end4 - start4) / 1000.0;
        System.out.println(s4);

        long start5 = System.currentTimeMillis();
        selectSort(array2);
        long end5 = System.currentTimeMillis();
        double s5 = (end5 - start5) / 1000.0;
        System.out.println(s2);

        long start6 = System.currentTimeMillis();
        selectSort(array3);
        long end6 = System.currentTimeMillis();
        double s6 = (end6 - start6) / 1000.0;
        System.out.println(s6);

        long start7 = System.currentTimeMillis();
        insertSort(array1);
        long end7 = System.currentTimeMillis();
        double s7 = (end7 - start7) / 1000.0;
        System.out.println(s7);

        long start8 = System.currentTimeMillis();
        insertSort(array2);
        long end8 = System.currentTimeMillis();
        double s8 = (end8 - start8) / 1000.0;
        System.out.println(s8);

        long start9 = System.currentTimeMillis();
        insertSort(array3);
        long end9 = System.currentTimeMillis();
        double s9 = (end9 - start9) / 1000.0;
        System.out.println(s9);
    }


    //随机数组排序正确性
    public static void main1(String[] args) {
        long[] arr1 = buildRandomArray(10000);
        long[] arr2 = arr1.clone();//把对象完全复制了一份
        bubbleSort(arr1);
        Arrays.sort(arr2);
        //测试数组排序后的正确性
        System.out.println(Arrays.equals(arr1,arr2));

        long[] arr3 = buildRandomArray(10000);
        long[] arr4 = arr3.clone();//把对象完全复制了一份
        selectSort(arr3);
        Arrays.sort(arr4);
        //测试数组排序后的正确性
        System.out.println(Arrays.equals(arr3,arr4));

        long[] arr5 = buildRandomArray(10000);
        long[] arr6 = arr5.clone();//把对象完全复制了一份
        insertSort(arr5);
        Arrays.sort(arr6);
        //测试数组排序后的正确性
        System.out.println(Arrays.equals(arr5,arr6));
    }

    //逆序数组排序正确性
    public static void main0(String[] args) {
        long[] arr1 = buildReversedArray(10000);
        long[] arr2 = arr1.clone();//把对象完全复制了一份
        bubbleSort(arr1);
        Arrays.sort(arr2);
        //测试数组排序后的正确性
        System.out.println(Arrays.equals(arr1,arr2));

        long[] arr3 = buildReversedArray(10000);
        long[] arr4 = arr3.clone();//把对象完全复制了一份
        selectSort(arr3);
        Arrays.sort(arr4);
        //测试数组排序后的正确性
        System.out.println(Arrays.equals(arr3,arr4));

        long[] arr5 = buildReversedArray(10000);
        long[] arr6 = arr5.clone();//把对象完全复制了一份
        insertSort(arr5);
        Arrays.sort(arr6);
        //测试数组排序后的正确性
        System.out.println(Arrays.equals(arr5,arr6));
    }

    //顺序数组排序正确性
    public static void main00(String[] args) {
        long[] arr1 = buildSortedArray(10000);
        long[] arr2 = arr1.clone();//把对象完全复制了一份
        bubbleSort(arr1);
        Arrays.sort(arr2);
        //测试数组排序后的正确性
        System.out.println(Arrays.equals(arr1,arr2));

        long[] arr3 = buildSortedArray(10000);
        long[] arr4 = arr3.clone();//把对象完全复制了一份
        selectSort(arr3);
        Arrays.sort(arr4);
        //测试数组排序后的正确性
        System.out.println(Arrays.equals(arr3,arr4));

        long[] arr5 = buildSortedArray(10000);
        long[] arr6 = arr5.clone();//把对象完全复制了一份
        insertSort(arr5);
        Arrays.sort(arr6);
        //测试数组排序后的正确性
        System.out.println(Arrays.equals(arr5,arr6));
    }
}
