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
    public ListNode middleNode(ListNode head) {
//         ListNode curr=head;
//         ListNode turtle=curr;
//         while(curr!=null){
//             ListNode khargos=curr.next;
//             if(khargos!=null){
//                 khargos=khargos.next;
//             }



// if(curr.next!=null){
    
//     turtle=turtle.next;;
// }
// // if (curr.next != null) {
// //     turtle = turtle.next;
// // }
// curr=khargos;

//         }
//         return turtle;
ListNode fast = head;
ListNode slow = head;

while (fast != null) {
    fast = fast.next;

    if (fast != null) {
        fast = fast.next;
        slow = slow.next;
    }

    
}

return slow;

}
}