package 力扣155;

import java.util.Stack;

public class MinStack1 {
    private Stack<Integer> normal = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public MinStack1() {

    }

    public void push(int val) {
        normal.push(val);
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }else {
        }
    }

    public void pop() {
        int e = normal.peek();
        normal.pop();
        //min.peek（）是Interger类型  两个Interger类型不能进行比较  因为不会进行自动拆箱
        //e != min.peek()此处左边是int类型 右边是Interger类型 此时这里可以自动拆箱
        if(e != min.peek()){

        }else {
            min.pop();
        }
    }

    public int top() {
        return normal.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
