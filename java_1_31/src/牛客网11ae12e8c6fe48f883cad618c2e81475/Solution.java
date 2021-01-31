//以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回
package 牛客网11ae12e8c6fe48f883cad618c2e81475;

import java.util.*;

public class Solution {
    public String solve (String s, String t) {
        if(s.equals("0")){
            return t;
        }
        //1.将字符串转换成字符数组
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        //2.将字符数组转换成整数数组
        int[] sIntArray = toIntArray(sArray);
        int[] tIntArray = toIntArray(tArray);

        //3.数组逆置
        int[] sIntRArray = reverse(sIntArray);
        int[] tIntRArray = reverse(tIntArray);

        //4.创建整数结果数组
        int m = Math.max(sIntArray.length,tIntArray.length);
        int[] ansIntArray = new int[m + 1];
        int carry = 0; //代表进位
        //5.先计算公共部分
        int i= 0;
        int n = Math.min(sIntArray.length,tIntArray.length);
        for(i = 0; i < n;i++){
            int r = sIntRArray[i] + tIntRArray[i] + carry;
            ansIntArray[i] = r % 10;
            carry = r / 10;
        }

        //6.处理非公共部分
        //找到最长的那个数组
        int[] maxArray = sIntRArray;
        if(sIntRArray.length < tIntRArray.length){
            maxArray = tIntRArray;
        }
        for(; i < m;i++){
            int r = maxArray[i] + carry;
            ansIntArray[i] = r % 10;
            carry = r / 10;
        }

        ansIntArray[m] = carry;

        //7.将整数结果数组进行逆置
        int[] ansIntRArray = reverse(ansIntArray);

        //8.若高位进位为0需要去掉并转换成字符数组
        char[] ans = change(ansIntRArray);
        return new String(ans);
    }

    private char[] change(int[] array) {
        char[] ret = new char[array.length - 1];
        char[] ret1 = new char[array.length];
        if(array[0] == 0){
            for(int i = 1; i < array.length ;i++){
                ret[i - 1] = (char)(array[i] + '0');
            }
            return ret;
        }else{
            for(int i = 0; i < array.length ;i++){
                ret1[i] = (char)(array[i] + '0');
            }
            return ret1;
        }
    }

    private int[] reverse(int[] intArray) {
        int i = 0;
        for(i = 0;i < intArray.length/2;i++){
            int tmp = intArray[i];
            intArray[i] = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = tmp;
        }
        return intArray;
    }

    private int[] toIntArray(char[] array) {
        int[] ret = new int[array.length];
        int i = 0;
        for(i = 0; i < array.length; i++){
            ret[i] = array[i] - '0';
        }
        return ret;
    }

    public static void main(String[] args) {
        String s = "733064366";
        String t = "459309139";
        Solution a = new Solution();
        System.out.println(a.solve(s,t));
    }
}
