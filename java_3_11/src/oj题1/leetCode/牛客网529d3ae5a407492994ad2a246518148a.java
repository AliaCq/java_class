package oj题1.leetCode;

public class 牛客网529d3ae5a407492994ad2a246518148a {
    public int length(ListNode head){
        int len =0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        return len;
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        int len = length(head);
        if(len < k){
            return null;
        }
        ListNode cur = head;
        for(int i = 0;i < len-k;i++){
            cur = cur.next;
        }
        return cur;
    }

    public ListNode FindKthToTail1(ListNode head,int k) {

        ListNode front = head;
        ListNode back = head;
        for(int i = 0; i < k;i++){
            if(front == null){
                return null;
            }
            front = front.next;
        }

        while (front != null){
            front = front.next;
            back = back.next;
        }
        return front;
    }
}

