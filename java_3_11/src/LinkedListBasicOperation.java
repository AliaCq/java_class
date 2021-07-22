public class LinkedListBasicOperation {
    //头插
    public static Node pushFront(Node head, int val) {
        // 1. 把元素 val 装入结点中
        Node node = new Node(val);
        node.next = head;
        return node;
    }

    //头删
    public static Node popFront(Node head) {
        // head != null

        return head.next;
    }

    //遍历输出链表
    private static void printLinkedList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    //尾插
    private static Node pushBack(Node head, int val) {
        Node node = new Node(val);
        if (head != null) {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;

            return head;
        } else {
            return node;
        }
    }

    //尾删
    private static Node popBack(Node head) {
        if (head.next != null) {
            Node last = head;
            //找到倒数第二个结点
            while (last.next.next != null) {
                last = last.next;
            }
            last.next = null;
            return head;
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        head = pushBack(head, 1);
        head = pushBack(head, 2);
        head = pushBack(head, 3);

        printLinkedList(head);
        popBack(head);
        printLinkedList(head);
        popBack(head);
        printLinkedList(head);
    }
}
