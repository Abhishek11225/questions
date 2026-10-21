// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i, j};
//                 }
              
//             }
//         }
//    return new int[]{-1, -1};
//     }
// }

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        Arrays.sort(nums);
//         int start=0;
//         int end=nums.length-1;
//         while(start<end){
//             int sum=nums[start]+nums[end];
//             if(sum==target){
//                 return new int[]{start,end};
//             }
//             else if(sum>target){
//                 end--;
//             }
//             else{
//                 start++;
//             }
//         }
//         return new int[]{-1,-1};
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>op=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(op.containsKey(rem)){
                return new int[]{op.get(rem),i};
            }
            op.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}