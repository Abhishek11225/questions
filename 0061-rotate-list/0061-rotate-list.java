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
    public ListNode rotateRight(ListNode head, int k) {

        // ListNode curr=head;
        // int count=0;
        
        // for(ListNode temp=head;temp!=null;temp=temp.next){
        //     count++;
        // }
        // k=k&count;
        // if(k==0){
        //     return head;
        // }
        // for(int i=0;i<count-k-1;i++){
        //     curr=curr.next;
            
        // }
        // ListNode prev=null;
        // ListNode current=head;
        // while(current!=null){
        //     ListNode forward=current.next;
        //     current.next=prev;
        //     prev=current;
        //     current=forward;
        // }
        // // prev h ab rever ka last aur curr h aage ka hed
        // for(int j=0;j<k;j++){
        //     if(prev.next!=null){
        //     prev=prev.next;
        // }
        // }

        // return curr=prev.next;
if(head==null||head.next==null||k==0){
    return head;
}
        ListNode curr=head;
        int count=0;
        ListNode first=head;

        while(curr!=null){
            curr=curr.next;
            count++;
        }
        k=k%count;
        if(k==0){
            return head;
        }
        for(int i=0;i<count-k-1;i++){
            first=first.next;
        }
        // abhi first kth node k ek pehle h
        ListNode newhead=first.next;
        ListNode tail=newhead;
        while(tail.next!=null){
            tail=tail.next;

        }
        // akhiri node ko head bna do aur kth ko null matlab first ke next ko null se point kr do se point kr do
        tail.next=head;
        
        first.next=null;
        return newhead;
        
    }
}