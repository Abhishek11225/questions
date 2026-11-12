class Solution {
    public int longestValidParentheses(String s) {
        // char[] ch=s.toCharArray();
        // int max=0;
       

        // for(int i=0;i<ch.length;i++){
        //      Deque<Character>st=new ArrayDeque<>();
        //     int count=0;
        //     for(int j=i;j<ch.length;j++){

        //         if(ch[j]=='('){
        //             st.push(ch[j]);

        //         }
        //         else{
        //             if(!st.isEmpty()&&ch[j]==')'){
        //                 st.pop();
        //                 count++;
        //                 max=Math.max(max,count*2);
        //             }

        //             else{
        //                 break;
        //             }
        //         }


        //     }
        // }
        // return max;
        int max=0;
        Deque<Integer>st=new ArrayDeque<>();

        st.push(-1);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();

                if(st.isEmpty()){
                    st.push(i);
                }
                else if(!st.isEmpty()&&s.charAt(i)==')'){
                    int len=i-st.peek();
                    max=Math.max(max,len);
                }
                
                
            }
        }
return max;
    }
}