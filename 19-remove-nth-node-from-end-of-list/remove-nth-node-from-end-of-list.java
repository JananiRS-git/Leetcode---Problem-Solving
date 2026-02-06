/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        int count=0;
        ListNode temp=head;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        int res=count-n;
        if(res==0)return head.next;
        ListNode temp1=head;
        for(int i=0;i<res-1;i++){
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        //head=temp;
        return head;
    }
}