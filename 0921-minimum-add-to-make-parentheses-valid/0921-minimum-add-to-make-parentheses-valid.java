class Solution {
    public int minAddToMakeValid(String s) {
//         Deque<Character>st=new ArrayDeque<>();
// int count=0;
//         for( char ch:s.toCharArray()){
//             if(ch=='('){
//                 st.push(ch);
//             }
//             else{
//                 if(st.isEmpty()){
//                     count++;
//                 }
//                 else if(ch==')'&&st.peek()!='('){
//                     count++;
//                 }
//                 else{
//                     st.pop();
//                 }
//             }
//         }
//         return count+st.size();

int open=0;
int close=0;

char ch[]=s.toCharArray();

for( int i=0;i<ch.length;i++){
    if( ch[i]=='('){
        open++;
    }
    else{
        if(ch[i]==')'&&open>0){
            open--;
        }
        else{
            close++;
        }
    }
}
return open+close;

    }
}