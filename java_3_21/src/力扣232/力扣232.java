package 力扣232;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    public MyQueue() {
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack2.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack1.isEmpty()){
//            int size = stack2.size();
//            for(int i = 0; i < size;i++){
//                int e = stack2.pop();
//                stack1.push(e);
            while (!stack2.isEmpty()){
                int e = stack2.pop();
                stack1.push(e);
            }
        }
        return stack1.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(stack1.isEmpty()){
            while (!stack2.isEmpty()){
                int e = stack2.pop();
                stack1.push(e);
            }
        }
        return stack1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
