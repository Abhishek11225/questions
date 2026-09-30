class Solution {
    public int reverse(int x) {
        // x=Math.abs(x);
        long rev=0;
        while(x!=0){
            
            long lasd=x%10;
            rev=rev*10+lasd;
            x=x/10; 
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        }
        return (int)rev;
    }
}