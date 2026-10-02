class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=0;
        int end=0;
        for(int i=0;i<weights.length;i++){
            end+=weights[i];
            start=Math.max(start,weights[i]);

        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isvalid(weights,days,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    static boolean isvalid(int []weights,int days,int mid){
        int dayscount=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]<=mid){
                sum+=weights[i];
            }
            else{
                dayscount++;
                sum=weights[i];
            }
        }
        return dayscount<=days;
    }
}