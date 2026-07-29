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
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
    
        if(c==n){
        
            return head.next;
        }
        int p=(c-n)+1;
        c=1;
        ListNode curr=head;
        ListNode pre=null;
        while(curr!=null){
             c++;
             
            pre=curr;
            curr=curr.next;
            if(c==p){
                pre.next=curr.next;
            }
        }
        return head;
    }
}