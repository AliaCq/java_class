public class HeapSort {
    public static void heapSort(long[] array){
        createBigHeap(array);

        for(int i = 0; i < array.length - 1;i++){
            swap(array,0,array.length - i - 1);
            shiftDown(array,array.length - i - 1,0);
        }
    }

    private static void createBigHeap(long[] array) {
        for(int i = (size - 2) / 2;i >= 0;i--){
            shiftDown(array,size,i);
        }
    }

    private static void shiftDown(long[] array, int size, int index) {
        while (true){
            int leftIndex = index * 2 + 1;
            if(leftIndex >= size){
                return;
            }

            int rightIndex = leftIndex + 1;
            int maxIndex = leftIndex;

            if(rightIndex < size && array[rightIndex] > array[leftIndex]){
                maxIndex = rightIndex;
            }

            if(array[maxIndex] <= array[index]){
                return;
            }
            long t = array[maxIndex];
            array[maxIndex] = array[index];
            array[index] = t;
            index = maxIndex;
        }
    }

    private static void swap(long[] array, int i, int j) {
        long k = array[i];
        array[i] = array[j];
        array[j] = k;
    }


}
