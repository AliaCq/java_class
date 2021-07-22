package practise;
//翻转链表
public class 题2 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
