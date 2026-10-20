/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode headN=dummy;
        int ans=0;
        for(ListNode temp1=headA;temp1!=null;temp1=temp1.next){
             for(ListNode temp2=headB;temp2!=null;temp2=temp2.next){
                if(temp1==temp2){
                    ans=temp1.val;
                    temp.next=new ListNode(ans);
                    temp=temp.next;
                }

             }
        }
        return headN.next;

    }
}