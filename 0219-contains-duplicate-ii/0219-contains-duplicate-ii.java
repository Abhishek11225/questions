class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //  HashSet<Integer> set = new HashSet<>();
        //  int n=nums.length;
        //  for(int i=0;i<n;i++){
        //     if(set.contains(nums[i])){
        //         return true;
        //     }
            
        //  set.add(nums[i]);
        //  if(set.size()>k){
        //     set.remove(nums[i-k]);
        //  }
        //  }
        //  return false;



        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int freq=map.getOrDefault(nums[i],0);

        //     if(freq>0&&i-map.get(nums[i])<=k){
        //         return true;
        //     }
        //     // else{
        //     //     map.remove(nums[i]);
        //     // }
        //     map.put(nums[i],i);
        // }
        // return false;

        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int freq=map.getOrDefault(nums[i],0);

            if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k){
                return true;
            }
            // else{
            //     map.remove(nums[i]);
            // }
            map.put(nums[i],i);
        }
        return false;
    }
}