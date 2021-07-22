//在array数组中，找第一次出现的target位置  找到返回下标 没找到返回-1
//从前往后查找
public class 练习1 {
    public static int indexOf(long[] array,long target) {
        int i = 0;
        for(i=0;i<array.length;i++)
        {
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
}
