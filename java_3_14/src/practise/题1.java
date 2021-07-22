package practise;
//删除元素
public class 题1 {
    public ListNode removElements(ListNode head,int val){
        ListNode curA = new ListNode(-1);
        curA.next = head;
        ListNode newHead = curA;

        ListNode cur = curA.next;
        ListNode prev = curA;
        while (cur != null){
            if(cur.val != val){
                prev = cur;
                cur = cur.next;
            }else {
                prev.next = cur.next;
                cur = cur.next;
            }
        }
        return newHead.next;
    }
}
