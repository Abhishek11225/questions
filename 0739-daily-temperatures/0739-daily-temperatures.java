class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //   int arr[]=new int[temperatures.length];
          
        //   for(int i=0;i<temperatures.length;i++){
        //   int diff=0;
        //     for(int j=i;j<temperatures.length;j++){
        //         if(temperatures[i]<temperatures[j]){
        //             diff=j-i;
        //             arr[i]=diff;
        //             break;
                    
        //         }
                

        //     }
           
        // }
        // return arr;
         int arr[]=new int[temperatures.length];

        Deque<Integer>st=new ArrayDeque<>();
      
        int k=0;

        for(int i=0;i<temperatures.length;i++){
            
            while(!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
              int  diff=st.pop();
                arr[diff]=i-diff;
                
               
                
            }
            st.push(i);

        }
return arr;


}
}