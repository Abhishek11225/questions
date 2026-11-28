class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // pehle ka elemen lelo aur dusre m echek kro
        int ans[]=new int[nums1.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        Deque<Integer>st=new ArrayDeque<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
              map.put(nums2[i],-1);
            }
            else{
               map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int j=0;j<nums1.length;j++){
            ans[j]=map.get(nums1[j]);
        }
        return ans;
    }
}