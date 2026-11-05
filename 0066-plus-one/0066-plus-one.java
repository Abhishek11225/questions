class Solution {
    public int[] plusOne(int[] digits) {
        // int ans[]=new int[digits.length+1];
        // int k=1;

        // for( int i=0;i<digits.length;i++){
        //     ans[k]=digits[i];
        //     k++;

        // }

        // int end=ans.length-1;

        // if(ans[end]!=9){
        //     if(ans[0]==0){
                
        //     }
        //     ans[end]=ans[end]+1;
        // }
        // else{
        //     ans[end]=0;
        //     ans[end-1]=1;
        // }
        // return ans;
int add=1;
        for( int i=digits.length-1;i>=0;i--){

            int sum=digits[i]+add;
            int digit=sum%10;

            digits[i]=digit;

            add=sum/10;

            if(add == 0) {
                return digits;
            }
        

       
        }

         if(add == 1) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
return digits;
        }
}

