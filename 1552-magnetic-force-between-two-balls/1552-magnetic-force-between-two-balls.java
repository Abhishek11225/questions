class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        // arr[i]-lastposi <=mid ttoh cunt badhao aur last position ko arr of i p rakh ko yahi h pura qn

        int start=0;
        int end=position[position.length - 1] - position[0];
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isvalid(position,m,mid)){
                ans=mid;
                start=mid+1;
                // coz we have to find max dist of two balls and that shiuled be min

            }
            else{
                end=mid-1;
            }
        }
        return ans;
        

    }
    static boolean isvalid(int[] position, int m,int mid){
        int count=1;
        int lastpos=position[0];
        for(int j=1;j<position.length;j++){
            if(position[j]-lastpos>=mid){
                count++;
                lastpos=position[j];
            }
            if(count>=m){
                return true;
            }
        }
        return false;
    }
}