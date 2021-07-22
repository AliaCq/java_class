package practise;
//合并两个链表
public class 题5 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode A = new ListNode(-1);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode newHead = A;

        while (cur1 != null && cur2 != null){
            if(cur1.val < cur2.val){
                A.next = cur1;
                cur1 = cur1.next;
            }else {
                A.next = cur2;
                cur2 = cur2.next;
            }
            A = A.next;
        }

        if(cur1 != null){
            A.next = cur1;
        }else if(cur2 != null) {
            A.next = cur2;
        }

        return newHead.next;
    }
}
