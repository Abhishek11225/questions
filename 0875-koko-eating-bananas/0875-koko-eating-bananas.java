class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // ek how lena h aur batana h ki kya humara total hour chota h hour h se agar h toh ttrue else fdalse 
        // /start ko lege 0 p end ko lenge max how p 
        // 3,4,5,11, isme max hour hour 11 h toh is case m humara max 11 hoga 
        int start=1;
        int end=0;
        for(int i=0;i<piles.length;i++){
            end=Math.max(end,piles[i]);
        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isvalid(piles,h,mid)){
                ans=mid;
                // agar mid p anser mil gya toh left jao kyuki right m aur jada hours aayega
                end=mid-1; 
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    static boolean isvalid(int[]piles,int h,int mid){
        long totalh=0;
        for(int j=0;j<piles.length;j++){
            totalh+=(piles[j]+mid-1)/mid;
            
        }
        if(totalh<=h){
            return true;
        }
        return false;
    }
}