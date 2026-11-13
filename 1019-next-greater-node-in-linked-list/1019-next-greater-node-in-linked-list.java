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
    public int[] nextLargerNodes(ListNode head) {
        // ListNode curr=head;
        ArrayList<Integer>ans=new ArrayList<>();
        Deque<Integer>st=new ArrayDeque<>();

        for(ListNode curr=head;curr!=null;curr=curr.next){
            ans.add(curr.val);
           
        }
        int result[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){ 
           while(!st.isEmpty()&&ans.get(i)>ans.get(st.peek())){
            int top=st.pop();
            result[top]=ans.get(i);
           }
           st.push(i);
        }
return result;

// ListNode dummy=new ListNode(-1);
// ListNode temp=dummy;

// ListNode curr=head;
// int count=0;
// while(curr!=null){
//     count++;
//     curr=curr.next;
// }
// int end=count;

// int result[]=new int[count];

// ListNode pop=head;


// for(int i=0;i<count;i++){
//    ListNode peek=pop.next;

//    while(peek!=null){
//     if(peek.val>pop.val){
//         result[i]=peek.val;
//         break;
//     }
//     peek=peek.next;
//    }
//    pop=pop.next;
// }
// return result;
        
    }
}