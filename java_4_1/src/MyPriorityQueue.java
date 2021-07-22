import java.util.Comparator;

public class MyPriorityQueue {
    // 不考虑扩容处理
    private String[] array = new String[100];
    private int size = 0;
    private Comparator<String> comparator;

    public MyPriorityQueue() {
        this.comparator = null;
    }

    public MyPriorityQueue(Comparator<String> comparator) {
        this.comparator = comparator;
    }

    public void add(String e) {
        array[size++] = e;
        shiftUp(size - 1);
    }

    private void shiftUp(int index) {
        while (true) {
            int fatherIndex = (index - 1) / 2;
            if (index <= 0) {
                return;
            }

            int r;
            if (comparator != null) {
                r = comparator.compare(array[index], array[fatherIndex]);
            } else {
                r = array[index].compareTo(array[fatherIndex]);
            }
            if (r >= 0) {
                return;
            }

            String t = array[index];
            array[index] = array[fatherIndex];
            array[fatherIndex] = t;

            index = fatherIndex;
        }
    }

    // O(log(n))
    public String remove() {
        // size > 0
        String e = array[0];
        array[0] = array[size - 1];
        size--;

        shiftDown(0);

        return e;
    }

    private void shiftDown(int index) {
        while (true) {
            int leftIndex = 2 * index + 1;
            if (leftIndex >= size) {
                return;
            }

            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if (rightIndex < size) {
                int r;
                if (comparator != null) {
                    r = comparator.compare(array[rightIndex], array[leftIndex]);
                } else {
                    r = array[rightIndex].compareTo(array[leftIndex]);
                }

                if (r < 0) {
                    minIndex = rightIndex;
                }
            }

            int r;
            if (comparator != null) {
                r = comparator.compare(array[index], array[minIndex]);
            } else {
                r = array[index].compareTo(array[minIndex]);
            }
            if (r <= 0) {
                return;
            }

            String t = array[index];
            array[index] = array[minIndex];
            array[minIndex] = t;

            index = minIndex;
        }
    }

    public String element() {
        // size > 0
        return array[0];
    }
}
