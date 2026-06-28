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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode second=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        ListNode mid1=first;
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        ListNode mid2=second;
        int t=mid1.val;
        mid1.val=mid2.val;
        mid2.val=t;
        return head;
    }
}