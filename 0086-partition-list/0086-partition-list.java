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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(-1);
        ListNode first=dummy;
        ListNode headN=dummy;
        ListNode honey=new ListNode(-1);
        ListNode second=honey;


        // ListNode slow=head;
        // ListNode fast=head;
        // while(fast!=null&&fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // ab hume re pass x ki value aa gai h 

        int data=x;
        ListNode curr=head;

        while(curr!=null){
            if(curr!=null&& curr.val<data){
                first.next=curr;
                first=first.next;
            }
            else{
                if(second!=null){
                second.next=curr;
                second=second.next;
            }
            }
            curr=curr.next;
        }
        first.next=honey.next;
        second.next=null;
        return headN.next;
    }
}