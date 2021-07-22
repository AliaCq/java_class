package Demo4;

public class JavaThreadState {
    public static void main(String[] args) {
        Thread.State[] values = Thread.State.values();
        for (Thread.State s: values){
            System.out.println(s);
        }
    }
}
