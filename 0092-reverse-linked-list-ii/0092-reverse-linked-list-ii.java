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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
       if(head==null){
        return head;
       }

       ListNode curr=head;
       ListNode temp=head;
       if(left==1){
        curr=head;
       }
      
if(left!=0){
       for( int i=1;i<left;i++){
        curr=curr.next;
       }
       
}
      
if(right!=0){
       for( int i=1;i<right;i++){
        temp=temp.next;
       }
       
}
       int temp1=curr.val;
       curr.val=temp.val;
       temp.val=temp1;


       return head;
    }
}