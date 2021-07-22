public class 泛型 {
    public static <T> int search(T[] array,T target){
        for(int i = 0;i < array.length; i++){
            T element = array[i];
            if(element.equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        {
            String[] array = {"hello", "world"};
            int r = 泛型.<String>search(array, "hello");
            System.out.println(r);
        }

        {
            Integer[] array = {1,2,3,4,5};
            int r = 泛型.<Integer>search(array, 3);
            System.out.println(r);
        }

        //省略写法 编译器能进行类型推导
        {
            Integer[] array = {1,2,3,4,5};
            int r = 泛型.search(array, 3);
            System.out.println(r);
        }

        //在同一个类中 因此类名也省略
        {
            Integer[] array = {1,2,3,4,5};
            int r = search(array, 3);
            System.out.println(r);
        }

    }
}
