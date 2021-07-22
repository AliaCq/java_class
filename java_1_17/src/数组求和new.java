public class 数组求和new {
        public static long Sum(long[] array,int fromIndex, int toIndex) {
            int i = 0;
            long sum = 0;
            if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
                throw new RuntimeException("传入的参数不合法");
            }
            for(i=fromIndex;i<toIndex;i++)
            {
                sum += array[i];
            }
            return sum;
        }
    }
