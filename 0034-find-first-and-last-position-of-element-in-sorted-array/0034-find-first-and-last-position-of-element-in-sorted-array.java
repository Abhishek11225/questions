// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int start=0;
//         int end=nums.length-1;
//         int ansr=-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(nums[mid]==target){
//                 ansr=mid;
//                 start=mid+1;
//             }
//             else if(nums[mid]<target){
//                 start=mid+1;

//             }
//             else{
//                 end=mid-1;
//             }
//         }

//         // now search left 
//           start=0;
//          end=nums.length-1;
//          int ansl=-1;
//         while(start<=end){
//              int mid=start+(end-start)/2;
//             if(nums[mid]==target){
//                 ansl=mid;
//                 end=mid-1;
//             }
//             else if(nums[mid]<target){
//                 start=mid+1;

//             }
//             else{
//                 end=mid-1;
//             }


        
//     }
//     return new int []{ansl,ansr};
// }
// }






















class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int ansL=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ansL=mid;
                end=mid-1;
            }
           else if(nums[mid]<target){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }

        start=0;
        end=nums.length-1;
        int ansR=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ansR=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return new int []{ansL,ansR};
    }
}
