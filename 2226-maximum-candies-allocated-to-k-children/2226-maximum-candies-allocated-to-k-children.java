class Solution {
    public int maximumCandies(int[] candies, long k) {
        int start=1;
        int end=0;
        int ans=0;

        for( int i=0;i<candies.length;i++){
            end=Math.max(end,candies[i]);
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(isvalid(candies,k,mid)){
                ans=mid;
                start=mid+1;
            
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    static boolean isvalid(int[] candies, long k,int mid){
        long count=0;

         for( int j=0;j<candies.length;j++){
            int rem=candies[j];
            
            // TLE
            // while(rem>=mid){
            //     count++;
            //     rem-=mid;
            // }


            // Optimal
            count+=candies[j]/mid;
        }
        if(count>=k){
            return true;
        }
        return false;
    }
}