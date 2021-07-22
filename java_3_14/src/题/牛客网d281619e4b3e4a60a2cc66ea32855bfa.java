package 题;

public class 牛客网d281619e4b3e4a60a2cc66ea32855bfa {
    public boolean chkPalindrome(ListNode A) {
        ListNode head = A;
        //找中间结点
        ListNode cur = A;
        ListNode cur1 = A;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }

        for(int i = 0;i < count / 2;i++){
            cur1 = cur1.next;
        }

        //将后半段链表逆置
        ListNode prev = null;
        ListNode nt = cur1;
        while (nt != null){
            ListNode next = nt.next;
            nt.next = prev;
            prev = nt;
            nt = next;
        }

        //进行判断
        while (prev != null && head != null){
            if(prev.val != head.val){
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}
