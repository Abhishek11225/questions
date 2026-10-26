/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node hot=head;
while(hot!=null){
    if(hot.child==null){
        hot=hot.next;
    }
    else{
        Node temp=hot.child;
        while(temp.next!=null){
            temp=temp.next;
        }
        // ab wo chack nod ke akhri element p h
        // uako ab pehle 
        // connext krne h image dekho aur uuse samjho aage ka
        // 3,4 k bich m connet krna h sabko toh
        // tempp ko chik k lat tk le gai jaite 10 tak 
        // ab temp.nexct ko  hot .next rako\
        // hot.next.prev=temp


        // ab 3 wale node ko cild koc onnet krte h aur use child ko kbhi then 3 baleka tend nukll

        temp.next=hot.next;
        if(hot.next!=null)
        hot.next.prev=temp;

        hot.next=hot.child;
        hot.child.prev=hot;
        hot.child=null;



    }
}
return head;
    }
}