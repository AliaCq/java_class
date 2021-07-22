package Demo3;

public class ArrayList{
    private int size = 0;
    private final long[] array = new long[100];

    public synchronized void add(long e){
        array[size++] = e;
    }

    public synchronized int size(){
        return size;
    }

    public synchronized long get(int index){
        if (index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
}
