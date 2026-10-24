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
    public ListNode[] splitListToParts(ListNode head, int k) {
         ListNode []ans=new  ListNode [k];
          ListNode now=head;
          int count=0;
          while(now!=null){
            now=now.next;
            count++;
          }
          int baseS=count/k;
          int extra=count%k;

           ListNode prev=null;
            ListNode  curr=head;

            for(int i=0;i<k;i++){
                if(curr==null){
                    ans[i]=curr;
                    continue;
                }
                ans[i]=curr;
                int width=baseS+(extra>0?1:0);
                extra--;
                for(int j=0;j<width;j++){
                    prev=curr;
                    curr=curr.next;
                }
                prev.next=null;
                prev=null;
            }
            return ans;
    }
}