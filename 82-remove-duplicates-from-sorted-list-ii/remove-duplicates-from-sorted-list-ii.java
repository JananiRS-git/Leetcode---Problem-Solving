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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode pre=null;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                while(temp!=null && temp.next!=null && temp.val==temp.next.val){
                    temp=temp.next;
                }
                if(pre==null){
                    head=temp.next;
                }else{
                    pre.next=temp.next;
                    temp=pre;
                }
                temp=temp.next;
            }
            else{
                if(pre==null){
                    pre=head;
                }
                else{
                    pre=pre.next;
                }
                temp=temp.next;
            }
        }
        return head;   
    }
}