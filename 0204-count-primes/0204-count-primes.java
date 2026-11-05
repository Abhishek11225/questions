class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }

        int arr[]=new int[n];

        for( int i=2;i<n;i++){
            arr[i]=1;
        }

        // or use arrays.fill
        // Arrays.fill(arr,1);

        for( int j=2;j*j<n;j++){

            if(arr[j]==1){
                for(int k=j*j;k<n;k+=j){
                    arr[k]=0;

                }

            }
      

        }
        int count=0;
        for( int s=2;s<n;s++){
                if(arr[s]==1){
                    count++;
                }
            }
            return count;

    }
}