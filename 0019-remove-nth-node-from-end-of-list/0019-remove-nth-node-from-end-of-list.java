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
       if(head==null||n<1){
            return null;
        }

        
ListNode curr =head;
ListNode forw=head;

for( int i=0;i<n;i++){
    if(forw == null){
                return head;
            }
    forw=forw.next;
}
if(forw == null){
                return head.next;
            }
while(forw!=null&&forw.next!=null){
    forw=forw.next;
    curr=curr.next;
}
if(curr.next!=null){
    curr.next=curr.next.next;
}
return head;

    }
}