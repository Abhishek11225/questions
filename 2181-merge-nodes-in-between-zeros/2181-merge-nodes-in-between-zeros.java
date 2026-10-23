
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
    public ListNode mergeNodes(ListNode head) {
        
 ListNode curr=head;
 ListNode dummy=new ListNode(-1);
 ListNode tail=dummy;
 ListNode headN=dummy;
 int sum=0;

 while(curr!=null){
    if(curr.val!=0){
        sum+=curr.val;
        curr=curr.next;
    }
    else{
        tail.next=new ListNode(sum);
        tail=tail.next;
        curr=curr.next;
        sum=0;
    }

 }
 return headN.next.next;


    }
}