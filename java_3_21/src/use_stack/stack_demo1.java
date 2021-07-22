package use_stack;

import java.util.Stack;

public class stack_demo1 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println(s); //[a,b,c]
        System.out.println(s.empty());
        System.out.println(s.isEmpty());

        System.out.println(s.peek()); //c
        System.out.println(s.peek());  //c
        System.out.println(s.pop());  //c
        System.out.println(s.pop());  //b
        System.out.println(s.peek()); //a
    }
}
