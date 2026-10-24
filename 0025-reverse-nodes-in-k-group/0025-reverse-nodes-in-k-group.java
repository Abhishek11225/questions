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
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode dummy=new  ListNode(-1);
         ListNode temp=dummy;
         ListNode curr=head;
        //  ListNode gino=head;
    
        //  agar curr nal nhi h wtoh aage badho
        
    while(curr!=null){

        // agar ye ocunt wala hata do ge toh pura hi reverse hoke aayeg agar cuntk se chota h tobh bhi wo rev hoga
        ListNode gino=curr;
        int count=0;
        while(gino!=null&&count<k){
            gino=gino.next;
            count++;
        }
         if(count<k){
                temp.next=curr;
                break;
            }
            else{
            ListNode prev=null;
            // start pointer se tempo ko aage badayenge
            ListNode start=curr;
            // abhi curr 1 p h aur aur rever k bad 12 h toh 21 hoga toh start p temp ko rkh dnege taki wo last node p aa jaye

            for(int i=0;i<k ;i++){
              

                if(curr!=null){
                 ListNode forward=curr.next;
                
                 curr.next=prev;
                 prev=curr;
                 curr=forward;
                }
            
            }
            temp.next=prev;
            start.next=curr;
            temp=start;

        }
    }
        return dummy.next;
    }
}