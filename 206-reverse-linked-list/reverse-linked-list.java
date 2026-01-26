class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode tail=head;
        ListNode pre=null;
        ListNode next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=pre;
            pre=temp;
            temp=next;
        }
        head=pre;
        return head;
    }
}