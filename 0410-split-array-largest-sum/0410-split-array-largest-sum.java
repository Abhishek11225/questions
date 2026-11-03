class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        int ans=-1;

        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<=end){
            int mid=start+(end-start)/2;

            if(isvalid(nums,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    static boolean isvalid(int[] nums, int k,int mid){
        int count=1;
        int sum=0;

        for(int j=0;j<nums.length;j++){
            if(sum+nums[j]<=mid){
                sum+=nums[j];

            }
            else{
                count++;
                sum=nums[j];
            }
        }
        if(count<=k){
            return true;
        }
        return false;

    }
}