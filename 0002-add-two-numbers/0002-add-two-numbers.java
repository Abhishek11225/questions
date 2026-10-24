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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {



        // agar l1 aur l2 null nih toh sum m add  kro
        // sum ka modulo temp m add kro
        // aur sum/10 kro taki carry nikal aayer 
        // starting m sum ko carry k barabar rakh lo]
        // taki agar carry ho toh wo carry ke sath agla step calculate kre

        // agar ek node chota h toh dure node ka val sum m dalo
        // then headN return kr lo
        // easy pese


        // abhi samj aaya gya h acche se isi liye easy pese likehe h 
        // depression m mt jana









         ListNode dummy=new  ListNode (-1);
          ListNode temp=dummy;
           ListNode headN=dummy;
          int sum=0;
          int carry=0;
         while(l1 != null || l2 != null || carry > 0){
            sum=carry;
            if(l1!=null&&l2!=null){
                sum+=l1.val+l2.val;
            }

            else if(l1!=null&&l2==null){
                sum+=l1.val;
            }
            else{
                if(l2!=null){
                sum+=l2.val;
            }
            }

            int nodee=sum%10;
             temp.next=new  ListNode(nodee);
             temp=temp.next;
              carry=sum/10;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
         }
return headN.next;
    }
}