package practise;

public class Main {
    public static void main(String[] args) {
        //1.构建测试数据
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        //2.调用方法
        //是普通方法
        //reverseList(n1) 本类的静态方法
        //题2.reverseList(n1)  其他类的静态方法
        题2 s = new 题2();
        ListNode r = s.reverseList(n1);


        //3.测试正确性
        //打印链表
        //System.out.println(r);  打印结点
        //在ListNode中重写toString方法后才能调用
        System.out.println(r);

        //遍历打印
        ListNode cur = r;
        while (cur != null){
            System.out.println(cur);
            cur = cur.next;
        }

    }
}
