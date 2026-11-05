class Solution {
    public int maxProduct(int[] nums) {
        
        int max=Integer.MIN_VALUE;;


        for( int j=0;j<nums.length;j++){
            int mult=1;
            for( int i=j;i<nums.length;i++){
            

            mult*=nums[i];
            max=Math.max(max,mult);

           
        }
        }
        return max;
    }
}