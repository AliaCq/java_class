package use_stack;

import java.util.Deque;
import java.util.LinkedList;

public class stack_demo2 {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack);//[c,b,a]
        System.out.println(stack.isEmpty());

        System.out.println(stack.peek()); //c
        System.out.println(stack.peek());  //c
        System.out.println(stack.pop());  //c
        System.out.println(stack.pop());  //b
        System.out.println(stack.peek()); //a
    }
}
