package use_queue;

import java.util.LinkedList;
import java.util.Queue;
//队头是准备删除的元素
//队尾是最后插入的元素
public class demo1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");//入队列
        queue.add("B");
        queue.add("C"); //尾插
        System.out.println(queue);
        System.out.println(queue.remove());//出队列 头删并返回删除元素
        System.out.println(queue.element());//查看的是队头
        System.out.println(queue);
    }
}
