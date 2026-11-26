class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]=new int[temperatures.length];
        Deque<Integer>st=new ArrayDeque<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
                int diff=st.pop();
                ans[diff]=i-diff;
            }
            st.push(i);
        }
        return ans;
    }
}