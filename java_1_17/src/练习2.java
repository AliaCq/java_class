//在array数组中，找第一次出现的target位置  找到返回下标 没找到返回-1
//从后往前查找
public class 练习2 {
    public static int indexOf(long[] array,long target) {
        int i = 0;
        for(i=array.length-1;i>=0;i--)
        {
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
}
