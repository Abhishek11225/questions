class Solution {
    public String makeGood(String s) {
        StringBuilder ans=new StringBuilder();

        Deque<Character>st=new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            // if(!st.isEmpty()&&Character.isUpperCase(s.charAt(i))&&Character.isLowerCase(st.peek())||!st.isEmpty()&&Character.isLowerCase(s.charAt(i))&&Character.isUpperCase(st.peek())){
            //     st.pop();
            // }

            if(!st.isEmpty()&&Character.isUpperCase(s.charAt(i))&&Character.isLowerCase(st.peek())&&Character.toUpperCase(s.charAt(i))==Character.toUpperCase(st.peek())||!st.isEmpty()&&Character.isLowerCase(s.charAt(i))&&Character.isUpperCase(st.peek())&&Character.toLowerCase(s.charAt(i))==Character.toLowerCase(st.peek())){
               st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        for(char ch:st){
            ans.append(ch);
        }
        ans.reverse();
        return ans.toString();
    }
}