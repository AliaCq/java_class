package oj题1.leetCode;

public class p21 {
    public ListNode mergeTwoList(ListNode l1,ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode last = new ListNode(-1);
        ListNode newhead = last;
        while(c1 != null && c2 != null){
            if(c1.val <= c2.val){
                last.val = c1.val;
                c1 = c1.next;
            }else {
                last.val = c2.val;
                c2 = c2.next;
            }
            last = last.next;
        }

        if(c1==null){
            last.next = c2;
        }else if(c2 == null){
            last.next = c1;
        }
        return newhead.next;
    }
}
