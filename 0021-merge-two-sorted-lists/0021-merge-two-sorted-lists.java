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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode ansH=dummy;
        ListNode ansT=dummy;

        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
               
                ansT.next=list1;
                list1=list1.next;
                ansT=ansT.next;
                
            }

            else{
                ansT.next=list2;
                list2=list2.next;
                ansT=ansT.next;

            }
            // ab agar koi bach gya jai merge to sorted array m ek array bada hoi tha tha toh us condition ko hande krte the awaise hi isko karenge 
           
        }
         if(list1!=null){
                ansT.next=list1;
            }
            if(list2!=null){
                ansT.next=list2;
            }
            ansH=ansH.next;
            dummy=null;;
        return ansH;
    }
}