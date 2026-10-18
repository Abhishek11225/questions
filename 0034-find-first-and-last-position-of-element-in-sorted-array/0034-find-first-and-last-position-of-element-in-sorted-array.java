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
        int ansl=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ansl=mid;
                end=mid-1;
            }
                        else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }

        int start1=0;
        int end1=nums.length-1;
        int ansr=-1;
        while(start1<=end1){
            int mid1=start1+(end1-start1)/2;
            if(nums[mid1]==target){
                ansr=mid1;
                start1=mid1+1;
            }
            else if(nums[mid1]<target){
                start1=mid1+1;
            }
            else{
                end1=mid1-1;
            }

        }
        return new int[]{ansl,ansr};
    }
}
