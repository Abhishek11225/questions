// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int num:nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//         }
//         for(int num:nums){
//         if(map.get(num)==1){
//             return num;
//         }
//         }
//         return -1;
//     }
// }

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid%2==0){

            
            if(nums[mid]==nums[mid+1]){
                start=mid+2;
            }
            else{
                end=mid;
            }
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
        }
        return nums[end];

    }
}