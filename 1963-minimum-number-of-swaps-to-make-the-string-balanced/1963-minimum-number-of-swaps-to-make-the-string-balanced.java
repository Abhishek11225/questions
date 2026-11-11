class Solution {
    public int minSwaps(String s) {
        int count=0;
        Deque<Character>st=new ArrayDeque<>();

     for(char ch:s.toCharArray()){

        if(ch=='['){
            st.push(ch);
        }
        else{
            if(!st.isEmpty()&&ch==']'){
                st.pop();
            }
            else{
                count++;
            }
            }
        
      

     }
      return (count+1)/2;


    }
}