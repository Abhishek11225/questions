class Solution {
    public int majorityElement(int[] nums) {
       
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);

        }
        int max=0;
        int ans=0;
        for(int y:map.keySet()){
            if(map.get(y)>max){
                max=map.get(y);
                ans=y;
            }
            
        }
        return ans;
    }
}