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
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode t=null;
        ListNode curr=head;
        while(curr!=null){
            pre=curr;
            curr=curr.next;
            pre.next=t;
            t=pre;
        }
        return t;
    }
}