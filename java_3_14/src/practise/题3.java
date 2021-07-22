package practise;
//返回中间结点
public class 题3 {
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        ListNode newHead = head;
        int count = 0;

        while (cur != null){
            count++;
            cur = cur.next;
        }

        for(int i = 0; i < count / 2;i++){
            newHead = newHead.next;
        }

        return newHead;
    }
}
