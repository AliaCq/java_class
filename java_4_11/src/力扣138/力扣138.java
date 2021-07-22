package 力扣138;

public class 力扣138 {
    public Node copyRandomList(Node head){
        if(head == null){
            return  null;
        }

        Node cur = head;
        //复制链表
        while(cur != null){
            Node next = cur.next;
            Node newNode = new Node(cur.val);
            cur.next = newNode;
            newNode.next = next;
            cur = next;
        }

        //连接random
        for(Node oldCur = head; oldCur != null; oldCur = oldCur.next.next){
            Node newCur = oldCur.next;

            Node oldRandom = oldCur.random;
            if(oldRandom == null){
                newCur.random = null;
            }else {
                Node newRandom = oldRandom.next;
                newCur.random = newRandom;
            }
        }

        //将新旧链表拆开
        Node newHead = head.next;

        for(Node oldNode = head; oldNode != null; oldNode = oldNode.next){
            Node newNode = oldNode.next;

            oldNode.next = newNode.next;
            if(newNode != null){
                newNode.next = newNode.next.next;
            }
            oldNode = oldNode.next;
        }

        return newHead;
    }

}
