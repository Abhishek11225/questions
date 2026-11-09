class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
       

        for(int fix=0;fix<nums.length-2;fix++){
            if(fix>0&&nums[fix]==nums[fix-1]){
                continue;
            }
            int start=fix+1;
            int end=nums.length-1;


            while(start<end){
                int sum=nums[fix]+nums[start]+nums[end];

                if(sum==0){
                    ans.add(Arrays.asList(nums[fix],nums[start],nums[end]));
                    start++;
                    end--;
                   

                    while(start<end&&nums[start]==nums[start-1]){
                        start++;
                    }

                    while(start<end&&nums[end]==nums[end+1]){
                        end--;
                    }
                   

                }
                else if(sum<0){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return ans;

    }
}