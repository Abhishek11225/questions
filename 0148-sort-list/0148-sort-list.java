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
    public ListNode sortList(ListNode head) {

     
        // for(ListNode curr=head;curr!=null;curr=curr.next){
        //     for(ListNode forward=curr.next;forward!=null;forward=forward.next){
        //         if(forward.val<curr.val){
        //             int temp=forward.val;
        //             forward.val=curr.val;
        //             curr.val=temp;
        //         }
        //     }
        // }
        
        // return head;
        if (head == null || head.next == null) {
            return head;
        }

ListNode prev=null;
ListNode slow=head;
ListNode fast=head;
while(fast!=null&&fast.next!=null){
    prev=slow;
    slow=slow.next;
    fast=fast.next.next;
     
}
// ab slow aut fats aa gye h apne jagah p aur prev slow ph 
// prev k basis p doivide kr lo
prev.next=null;
// ab divide k basis p 2 nodes banante h 
// then uspe merge 2 sorted linked list lagayenge

// head se prev tak;
ListNode left=sortList(head);
// prev se fast tak
ListNode right=sortList(slow);
return sorted(left,right);




    }
    ListNode sorted(ListNode left,ListNode right){

        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode headN=dummy;

        while(left!=null&&right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }
            else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
            if(left!=null){
                temp.next=left;
            }
            if(right!=null){
                temp.next=right;
            }
        }
        return headN.next;
    }
}