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
    public boolean isPalindrome(ListNode head) {
        // 2 part m bat lo
        // 2usre part ko rev kro then compare 
        // reverse ish liye kr rhe h kyuki prev chaiyre
        // prev ishliye chiaye kyu ki palindrome comapre krne k liye 
        // head toh head .next p chala jega elkin singly ll m head.prev nhi jayega...

        // turtois algorithm se nikalte h 
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        ListNode curr=slow;

        ListNode prev=null;
        ListNode forward=curr.next;

       
        while(curr!=null){

            curr.next=prev;
            prev=curr;
            curr=forward;
            if(curr!=null){
            forward=curr.next;
            }

        }
        while(prev!=null){
            if(head.val!=prev.val){
                return false;
            }
            head=head.next;
            prev=prev.next;

        }
        return true;

       }
}