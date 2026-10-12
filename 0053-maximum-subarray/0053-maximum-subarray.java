class Solution {
    public int maxSubArray(int[] nums) {
//        if(nums.length==1&&nums[0]<0){
//         return nums[0];
//        }

//         int max=nums[0];

//         for( int i=0;i<nums.length;i++){
//  int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 max=Math.max(sum,max);
//                 if(sum<0){
//                     break;
//                 }
                
//             }
//         }
//         return max;
    int sum=0;
    int max=nums[0];
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        max=Math.max(sum,max);

        if(sum<0){
            sum=0;
        }
    }
    return max;

    }
}