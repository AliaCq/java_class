package 题;

public class 牛客网0e27e0b064de4eacac178676ef9c9d70 {
    public ListNode partition(ListNode pHead,int x){
        ListNode lastA = new ListNode(-1);
        ListNode headA = lastA;

        ListNode lastB = new ListNode(-1);
        ListNode headB = lastB;

        for(ListNode cur = pHead; cur != null; cur = cur.next){
            if(cur.val < x){
                lastA.next = cur;
                lastA = cur;
            }else {
                lastB.next = cur;
                lastB = cur;
            }
        }
        lastA.next = headB.next;
        lastB.next = null;
        return headA.next;
    }
}
