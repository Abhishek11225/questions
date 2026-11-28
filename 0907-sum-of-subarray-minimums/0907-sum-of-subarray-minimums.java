class Solution {
    public int sumSubarrayMins(int[] arr) {
        // long sum=0;
        // int mod=1000000007;
                

        // for(int i=0;i<arr.length;i++){
        //     int min=Integer.MAX_VALUE;
        //     for(int j=i;j<arr.length;j++){

        //         min=Math.min(min,arr[j]);
        //         sum=(sum+min)%mod;
        //     }
        // }
        // return (int)sum;

    // ek nse and pse 
    int []ns=nse(arr);
    int []ps=pse(arr);
    int mod=1000000007;
    long sum=0;
    for(int k=0;k<arr.length;k++){
        int left = k - ps[k];
int right = ns[k] - k;
        long total=(long)arr[k]*left*right;

        sum=(sum+total)%mod;




    }

return (int)sum;
        


    }
    static int[] nse(int arr[]){
        int ns[]=new int[arr.length];
        Deque<Integer>st=new ArrayDeque<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ns[i]=arr.length;
            }
            else{
                ns[i]=st.peek();
            }
            st.push(i);
        }
        return ns;
    }

        static int[] pse(int arr[]){
        int ps[]=new int[arr.length];
        Deque<Integer>stt=new ArrayDeque<>();
        for(int j=0;j<arr.length;j++){
            while(!stt.isEmpty()&&arr[stt.peek()]>=arr[j]){
                stt.pop();
            }
            if(stt.isEmpty()){
                ps[j]=-1;
            }
            else{
                ps[j]=stt.peek();
            }
            stt.push(j);
        }
        return ps;
    }
}