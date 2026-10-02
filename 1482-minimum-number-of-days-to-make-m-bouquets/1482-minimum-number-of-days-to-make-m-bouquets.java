class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<bloomDay.length;i++){
            end=Math.max(end,bloomDay[i]);
        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isvalid(bloomDay,  m,  k,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }  
        }
        return ans;
    }
    static boolean isvalid(int[] bloomDay, int m, int k,int mid){
        int count=0;
        int bokey=0;
        for(int j=0;j<bloomDay.length;j++){
            if(bloomDay[j]<=mid){
                count++;
                if(count==k){
                    bokey++;
                    count=0;
                }
            }
                else{
                    count=0;
                }
            
        }
        return bokey>=m;
    }
}