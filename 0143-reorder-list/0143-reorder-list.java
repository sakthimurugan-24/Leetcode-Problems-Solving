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
    public void reorderList(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode cur=head;
        while(cur!=null){
            st.push(cur);
            cur=cur.next;

        }
        int n=st.size();
        cur=head;
        for(int i=0;i<n/2;i++){
            ListNode top=st.peek();
            st.pop();

            top.next=cur.next;
            cur.next=top;
            cur=top.next;
        }
        cur.next=null;
    }
}