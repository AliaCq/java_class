import java.util.Arrays;

public class 数组逆置 {
    public static int[] reverse(int[] array){
        int i = 0;
        for(i=0;i<array.length/2;i++){
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        //int[] array = {1,2,3,4,5};
        int[] array2 = {5,0,5,3,7,3,2,9,1,1};
        //int[] array1 = {1,2,3,4,5,6};
       // System.out.println(Arrays.toString(reverse(array)));
        System.out.println(Arrays.toString(reverse(array2)));
       // System.out.println(Arrays.toString(reverse(array1)));
    }
}
