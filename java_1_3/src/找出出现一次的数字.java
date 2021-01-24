//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
public class 找出出现一次的数字 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,6,2,3,4,5};
        int i = 0;
        int j = 0;
        int count = 0;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if(i != j && arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(arr[i]);
                break;
            }
            count = 0;
        }
    }
}
