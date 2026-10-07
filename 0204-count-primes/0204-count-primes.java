class Solution {
    public int countPrimes(int n) {
//         if(n<2){
//             return 0;
//         }
       
//         long count=0;
//         // i = 2
// // i = 3
// // i = 4
// // i = 5
// // i = 6
// // i = 7
// // i = 8
// // i = 9

// // Matlab outer loop ka kaam hai:
// // "Mujhe har number do, main check karunga ki ye prime hai ya nahi."
//         for(int i=2;i<n;i++){
//             boolean prime=true;

//             for(int j=2;j<=Math.sqrt(i);j++){
//                 if(i%j==0){
//                     prime=false;
//                     break;
//                 }
               
//             }
//             if(prime){
//              count++;
//             }
//         }
//         return (int)count;
 if (n < 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];

        // Assume all numbers are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Mark multiples as not prime
        for (int i = 2; i * i < n; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count primes
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}