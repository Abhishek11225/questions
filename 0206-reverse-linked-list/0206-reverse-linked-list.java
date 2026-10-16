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
        // ListNode curr=head;
        // ListNode prev=null;
        // while(curr!=null){
        //     ListNode forward=curr.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=forward;


        // }
        // return head;
         if (head == null) {
            return null;
        }

        ListNode curr=head;
        ListNode prev=null;
        ListNode forward=curr.next;
        

        ListNode ans = helper(head, curr, prev, forward);
return ans;
       

    }
    static ListNode helper(ListNode head,ListNode curr,ListNode prev,ListNode forward){
        if(curr==null){
            return prev;
        }
        curr.next=prev;
        prev=curr;
        curr=forward;
        
        

     if (curr != null) {
            forward = curr.next;
        }
       return  helper(head,curr,prev,forward);
    
}

}
