class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long start=0;
        int less=Integer.MAX_VALUE;
        for(int i=0;i<time.length;i++){
            less=Math.min(less,time[i]);
        }
        long end=(long)less * totalTrips;
        long ans=-1;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(isvalid(time,totalTrips,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    static boolean isvalid(int[] time, int totalTrips,long mid){
        long sum=0;
        for(int j=0;j<time.length;j++){
            sum+=mid/time[j];
            if(sum>=totalTrips){
                return true;
            }
        }
        return false;
    }
}