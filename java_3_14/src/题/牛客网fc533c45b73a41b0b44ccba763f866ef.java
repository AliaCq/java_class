package 题;

public class 牛客网fc533c45b73a41b0b44ccba763f866ef {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null){
            return null;
        }

        ListNode prev = new ListNode(-1);
        prev.next = pHead;
        ListNode newHead = prev;

        ListNode p1 = pHead;
        ListNode p2 = pHead.next;

        while (p2 != null){
            if(p1.val != p2.val){
                prev = prev.next;
                p1 = p1.next;
                p2 = p2.next;
            }else {
                while (p2 != null && p1.val == p2.val){
                    p2 = p2.next;
                }

                prev.next = p2;

                p1 = p2;
                if(p2 != null){
                    p2 = p2.next;
                }
            }
        }
        return newHead.next;
    }
}
