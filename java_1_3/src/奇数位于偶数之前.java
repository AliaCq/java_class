import java.util.Arrays;

//调整数组顺序使得奇数位于偶数之前
public class 奇数位于偶数之前 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,6};
        int[] arr1 = new int[arr.length];
        int i = 0;
        int j = 0;
        for(i = 0;i<arr.length;i++){
            if(arr[i] % 2 != 0 ){
                arr1[j] = arr[i];
                j++;
            }else {
                arr1[arr1.length - j] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
