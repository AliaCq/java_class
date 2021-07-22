package 力扣225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        Queue<Integer> queue;
        if (!queue1.isEmpty()) {
            queue = queue1;
        } else if (!queue2.isEmpty()) {
            queue = queue2;
        } else {
            queue = queue1;
        }

        queue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return 1;
    }

    /** Get the top element. */
    public int top() {
        return 1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
