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
    public ListNode swapNodes(ListNode head, int k) {
        // ListNode now=head;
        // int count=0;
        // while(now!=null){
        //     now=now.next;
        //     k--;
        //     if(k==0){
        //        ListNode temp=new ListNode(now.val);
        //     }
        // }
        // ListNode prev=null;
        // ListNode curr=head;
        // while(curr!=null){
        //     ListNode forward=forward.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=forward;

        // }
        // while(prev!=null){
        //     prev=prev.next;
        //     k--;
        //     if(k==0){
        //         ListNode temp1=new ListNode(prev.val);
        //     }
        // }
        // temp.val=temp1.val;
        // temp1.val=temp.val;
        // return head;




    ListNode curr=head;
    int count=0;
    // int temp1=0;
    // int temp2=0;

    while(curr!=null){
        curr=curr.next;
        count++;
    }
    ListNode first = head;
    for(int i=1;i<k;i++){
       
        first=first.next;
        

    }
    ListNode second = head;
    for(int j=0;j<count-k;j++){
        second=second.next;

    }
    int temp=first.val;
    first.val=second.val;
    second.val=temp;

    return head;





    }
}