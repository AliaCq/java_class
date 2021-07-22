package oj题1.leetCode;

public class p876 {
    public int length(ListNode head){
        int len =0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        return len;
    }

    public ListNode middleNode(ListNode head){
        int len = length(head);
        ListNode cur = head;
        for(int i = 0;i < len / 2;i++){
            cur = cur.next;
        }
        return cur;
    }

    public ListNode middleNode1(ListNode head){

        ListNode c1 = head;
        ListNode c2 = head;
        while (c2 != null){
            c2 = c2.next;
            if(c2 == null){
                break;
            }
            c2 = c2.next;
            c1 = c1.next;
        }
        return c1;
    }
}
