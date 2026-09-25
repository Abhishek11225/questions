class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        while(start<=end){
            if(x==0){
                return 0;
            }
            int mid=start+(end-start)/2;
            if((long)mid*mid==x){
                return mid;
            }
            if((long)mid*mid<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        // used flow kyuki agar perfect sqr nhi h toh usse sbse chota wala ka sq return ktr do 

        return end;
    }
}