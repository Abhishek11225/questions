class Solution {
    public int longestOnes(int[] nums, int k) {
        
        // int max=0;
        // int originalK = k;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //        k = originalK;
        //     for( int j=i;j<nums.length;j++){
        //         if(nums[j]==1){
        //             count++;
        //         }
        //        else if(nums[j]==0&&k>0){
        //             count++;
        //             k--;
        //         }
                
        //         else{
        //             break;
        //         }
        //         max=Math.max(max,count);
                
        //     }
        // }
        // return max;

         int max = 0;
        int count = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == 0) {
                k--;
            }

            while (k < 0) {
                if (nums[i] == 0) {
                    k++;
                }
                i++;
            }

            count = j - i + 1;
            max = Math.max(max, count);
        }

        return max;
    }
}