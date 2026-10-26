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
    public ListNode doubleIt(ListNode head) {
        // apprach of this qn 
        // pura ll reverse kro usme airthmatic operstions kro phir ll ko wals revers kr do u will gety ur ans.
        head=reverse(head);
        // if(head==null){
        //     return head;
        // }
         int carry=0;
        ListNode pen=head;
        while(pen!=null){
            
           
            int sum=pen.val+pen.val+carry;
            // iska modulo nikla lete h aur usko andar dal dete h va;ue ke madulo ish liye kyuki agar okoi caary hoga toh woh case handle karenge 
            // /aur hime val 9 se bada nhi rakhna h
            int digit=sum%10;
            pen.val=digit;

            carry=sum/10;

            if(pen.next==null&&carry>0){
                pen.next=new ListNode(carry);

                carry=0;
                pen=pen.next;
            }
            pen=pen.next;

        }
        head=reverse(head);
        return head;


    }
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
}