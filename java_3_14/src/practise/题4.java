package practise;
//找到倒数第K个结点
public class 题4 {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        //应该两个中间差K个结点
        for(int i = 0; i < k;i++){
            if(cur2 == null){
                return null;
            }
            cur2 = cur2.next;
        }

        while (cur2 != null){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return cur1;
    }
}
