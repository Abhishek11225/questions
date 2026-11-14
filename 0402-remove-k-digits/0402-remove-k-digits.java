class Solution {
    public String removeKdigits(String num, int k) {
        // hello
        // jaise jaise bada aayega pop jkete jaba
    Deque<Character>st=new ArrayDeque<>();

    for( char ch:num.toCharArray()){
        while(!st.isEmpty()&&k>0&&st.peek()>ch){
            st.pop();
            k--;
        }
        st.push(ch);

        

    }
    while(!st.isEmpty()&&k>0){
            st.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();

        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        ans.reverse();
        int index=0;

        while(index<ans.length()&&ans.charAt(index)=='0'){
            index++;
            
        }
        String result=ans.substring(index);

        if(result.length()==0){
            return "0";
        }
        return result;


    }
}