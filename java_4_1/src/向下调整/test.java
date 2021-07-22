package 向下调整;

import java.util.Arrays;

public class test {
    public static void shiftDown(long[] array,int size,int index){
        while(true){
            int leftIndex = 2 * index + 1;
            if(leftIndex >= size){
                return;
            }

            int rightIndex = leftIndex + 1;
            int miniIndex = leftIndex;
            if(rightIndex < size && array[rightIndex] < array[leftIndex]){
                miniIndex = rightIndex;
            }

            if (array[index] <= array[miniIndex]){
                return;
            }

            long t = array[miniIndex];
            array[miniIndex] = array[index];
            array[index] = t;

            index = miniIndex;
        }
    }

    public static void createHeap(long[] array,int size){
        for(int i = (size - 2) / 2;i >= 0;i--){
            shiftDown(array,size,i);
        }
    }

    public static void main(String[] args) {
        long[] array = {27,15,19,18,28,34,65,49,25,37,-1,-1};
        int size = 10;
        shiftDown(array,size,0);
        System.out.println(Arrays.toString(array));
        long[] array1 = {9,3,1,4,2,5,8,3,6,0,1,-1,-1};
        int size1 = 11;
        createHeap(array1,size1);
        System.out.println(Arrays.toString(array1));
    }
}
