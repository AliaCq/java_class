public class 泛型类<E> {
    private E[] array;
    private int size;
    public void add(E element){

    }

    public static void main(String[] args) {
        {
            泛型类<String> list = new 泛型类<String>();
            list.add("hello");
        }

        {
            泛型类<Integer> list = new 泛型类<>();
            list.add(3);
        }

        //前面不能省略 后面可以省略
        {
            泛型类<String> list = new 泛型类<>();
            list.add("hello");
        }
    }
}
