class Solution {
    public int minSwaps(String s) {
        // int count=0;
        // Deque<Character>st=new ArrayDeque<>();

        // for(char ch:s.toCharArray()){
        //     if(ch=='['){
        //         st.push(ch);
        //     }
        //     else{
        //         if(!st.isEmpty()&&ch==']'){
        //             st.pop();
        //         }
        //         else if(st.isEmpty()&&ch==']'){
        //             count++;
        //         }
        //     }
        // }
        // return (count+1)/2;

        int open=0;

        for( char ch:s.toCharArray()){
            if(ch=='['){
                open++;
            }
            else{
                if(open>0&&ch==']'){
                    open--;
                }
                else{
                    open++;
                }
            }
        }
        return (open+1)/2;
    }
}