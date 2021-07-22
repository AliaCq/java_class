public class Practice {
    //头插
    public static Node pushfront(Node head,int val){
        Node node = new Node(val);
        if(head == null){
            return node;
        }else{
            node.next = head;
            return node;
        }
    }

    //头删
    public static Node popfront(Node head){
        if(head.next !=null){
            return head.next;
        }else{
            return null;
        }
    }

    //尾插
    public static Node pushBack(Node head,int val){
        Node node = new Node(val);
        if(head == null){
            return node;
        }else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
            return head;
        }
    }

    //尾删
    public static Node popBack(Node head){
        if(head.next == null){
            return null;
        }else {
            Node node = head;
            while(node.next.next != null){
                node = node.next;
            }
            node.next = null;
            return head;
        }
    }

    private static void printLinkedList(Node head) {
        Node cur = head;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        head = pushBack(head, 1);
        head = pushBack(head, 2);
        head = pushBack(head, 3);

//        head = pushfront(head, 100);
//        head = pushfront(head, 200);
//        head = pushfront(head, 300);

        printLinkedList(head);
        Node popfront = popfront(head);
        printLinkedList(popfront);

//        printLinkedList(head);
//        popBack(head);
//        printLinkedList(head);
//        popBack(head);
//        printLinkedList(head);
    }


}
