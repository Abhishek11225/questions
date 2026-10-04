class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        int original=x;
        int rev=0;
        while(x!=0){
            int last=x%10;
            rev=rev*10+last;
            x=x/10;
            if(original==rev){
                return true;
            }
        }
        return false;
    }
}