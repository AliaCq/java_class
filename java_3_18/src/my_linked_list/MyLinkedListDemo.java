package my_linked_list;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(0,"Z");
        System.out.println(list);

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);

        list.add(1,"Z");
        System.out.println(list);

        list.add(0,"Z");
        System.out.println(list);

        list.add(4,"Z");
        System.out.println(list);

        list.add(6,"Z");
        System.out.println(list);
    }
}
