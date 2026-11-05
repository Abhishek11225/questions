class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
int max=0;
        while(j<nums.length){

            if(nums[j]==0&&k>0){
                k--;
            }
           else if(nums[j]==0&&k==0){
                if(nums[i]==0){
                   k= k+1;
                  


                }
                i++;
                continue;

            }
          
            max=Math.max(max,j-i+1);
            j++;
              
        }
        return max;
    }
}