package 题;

public class 第八题方法2 {
    public boolean chkPalindrome(ListNode A) {
        ListNode middle = getMidddle(A);
        ListNode reverseHead = reverseList(middle);

        ListNode curA = A;
        ListNode curB = reverseHead;

        while (curA != null && curB != null){
            if(curA.val != curB.val){
                return false;
            }
        }
        return true;
    }

    private ListNode reverseList(ListNode middle) {
        ListNode prev = null;
        ListNode cur = middle;

        while (cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    private ListNode getMidddle(ListNode A) {
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
        return cur1;
    }
}
