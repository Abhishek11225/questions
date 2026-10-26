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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if(head==null){
            return new int[]{-1,-1};
        }
        ArrayList<Integer>ans=new ArrayList<>();
ListNode prev=head;
ListNode curr=head.next;
// compare krne k liye values ka 
int i=1;
while(curr!=null&&curr.next!=null){
    if(curr.val<prev.val&&curr.val<curr.next.val){
        ans.add(i);
    }
    if(curr.val>prev.val&&curr.val>curr.next.val){
    ans.add(i);
    }
    curr=curr.next;
    prev=prev.next;
    i=i+1;
}
if(ans.size()<2){
    return new int[]{-1,-1};
}
// ab minima aur maxima nikalte h iska
// minimama nikalne k liye man lo 3,4.5 h toh 4-3,5-4 karenge aur math.in se inka minima nikal lenge

int mini=Integer.MAX_VALUE;
for(int j=1;j<ans.size();j++){
    mini=Math.min(mini,ans.get(j)-ans.get(j-1));
}
int maxi=ans.get(ans.size()-1)-ans.get(0);

return new int[]{mini,maxi};

    }
}