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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        for(ListNode op=temp;op!=null;op=op.next){
            count++;
        }
        if (n <= 0 || n > count) {
            return head;
        }
        for(int i=0;i<count-n;i++){
            temp=temp.next;
        }
         if (count - n == 0) {
            return head.next;
        }
        ListNode prev=head;
        // int value=temp.val;

    //     for(ListNode sexy=head;sexy!=null;sexy=sexy.next){
    //         ListNode forward= sexy.next;
    //         if(forward!=null&& forward.val==value){
    //             sexy.next=forward.next;   
    //             break;
    //         }
    // }
    for(int p=0;p<count-n-1;p++){
         prev = prev.next;
    }
    prev.next=temp.next;
     return head;
}
}