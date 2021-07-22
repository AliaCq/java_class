import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.add(0,"Z");
        list.add(1,"X");
        list.add(2,"Y");
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}
