import java.util.Set;
import java.util.TreeSet;

public class UsetreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(7);
        set.add(9);
        set.add(2);
        set.add(6);
        System.out.println(set);
        System.out.println(set.add(2));
    }
}
