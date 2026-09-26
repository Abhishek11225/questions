// class Solution {
//     public int findMin(int[] nums) {
//         Arrays.sort(nums);
//         int ans=Integer.MAX_VALUE;;
//         for(int i=0;i<nums.length;i++){
//             ans=Math.min(ans,nums[i]);
//         }
//         return ans;
//     }
// }


// class Solution {
//     public int findMin(int[] nums) {
//         int start=0;
//         int end=nums.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(nums[mid]>nums[end]){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
            
            
//         }
//         return nums[start];
//     }
// }

class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(start<end){
            
            int mid=start+(end-start)/2;
            ans=Math.min(ans,nums[mid]);

            if(nums[mid]>nums[end]){
                start=mid+1;
        }
        else{
                end=mid;
            }
    }
    ans=Math.min(ans,nums[start]);
    return ans;
}
}