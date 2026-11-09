class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ansL=-1;
        int start=0;
        int end=nums.length-1;

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


                int ansR=-1;
        int star=0;
        int en=nums.length-1;

        while(star<=en){
            int mi=star+(en-star)/2;

            if(nums[mi]==target){
                ansR=mi;
                star=mi+1;
            }
            else if(nums[mi]<target){
                star=mi+1;
            }
            else{
                en=mi-1;
            }
        }
        return new int[]{ansL,ansR};
    }
}