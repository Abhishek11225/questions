class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character>st1=new ArrayDeque<>();
        Deque<Character>st2=new ArrayDeque<>();
        StringBuilder ans1=new StringBuilder();
        StringBuilder ans2=new StringBuilder();

        for( int i=0;i<s.length();i++){
            if(s.charAt(i)=='#') {
    if(!st1.isEmpty()) {
        st1.pop();
    }
}
            else{
                st1.push(s.charAt(i));
            }
        }
        for(char ch:st1){
            ans1.append(ch);
        }





          for( int j=0;j<t.length();j++){
            if(t.charAt(j)=='#') {
    if(!st2.isEmpty()) {
        st2.pop();
    }
}
            else{
                st2.push(t.charAt(j));
            }
        }

            for(char ch1:st2){
            ans2.append(ch1);
        }
        if(ans1.toString().equals(ans2.toString())) {
    return true;
}
return false;

        
    }
}