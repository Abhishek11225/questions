class Solution {
    public int trailingZeroes(int n) {
        // // el count lelo 0 jo ki count kaerga kitne zeros h 
        // // the brute force approach is sabka factorial nikalo ab ab jo fact aaya h uako modulo 10 kro agar 0 aaya toh count badha do aur n10 krte rho

        // // solve with brute force
        // int fact =1;
        // for(int i=n;i>=1;i--){
        //     fact=fact*i;
        // }
        // int count=0;
        // // ab fact mil gya h nam lo 120 
        // while(fact!=0){
        //     int last=fact%10;
        //     if(last==0){
        //         count++;
        //     }
        //     else{
        //         break;
        //     }
        //     fact = fact / 10;
        // }
        // return count;
        // ab optimal


        int count=0;
        for(int i=0;i<n;i++){
            n=n/5;
            count+=n;
        }
        return count;

    }
}