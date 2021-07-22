import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }

    public static void main(String[] args) {
        Comparator<Integer> comparator = new IntegerComparator();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(comparator);
        Queue<Integer> queue = priorityQueue;

        queue.add(3);
        queue.add(5);
        queue.add(2);
        queue.add(7);
        queue.add(9);

        // 1. Integer 有没有实现过 Comparable? 有
        // 1. PriorityQueue 是大堆还是小堆？    小堆

        System.out.println(queue.remove()); // 2
        System.out.println(queue.remove()); // 3
        System.out.println(queue.remove()); // 5
        System.out.println(queue.remove()); // 7
        System.out.println(queue.remove()); // 9
    }
}
