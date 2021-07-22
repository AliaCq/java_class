package Binary_Search;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        long[][] array = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        int rows = 3;
        int columns = 5;
        long target = 0;
        for(target=0;target <= 16;target++){
            int[] index = Search.search(array,rows,columns,target);
            System.out.println(Arrays.toString(index));
        }
    }
}
