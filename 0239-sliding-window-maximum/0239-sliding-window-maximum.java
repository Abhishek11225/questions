class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // ArrayList<Integer>ans=new ArrayList<>();
        // ArrayList<Integer>window=new ArrayList<>();
        // int max=nums[0];

        // for(int i=0;i<k;i++){
        //     window.add(nums[i]);
        //     max=Math.max(max,nums[i]);
        // }
        // ans.add(max);
        // for(int j=k;j<nums.length;j++){
        //     window.add(nums[j]);
        //     window.remove(Integer.valueOf(nums[j-k]));
            
        //    max= window.get(0);
        //     // for(int x=0;x<window.size();x++){
        //     // max=math.max max nums (x)
        //     // }
        //     for(int x:window){
        //         max=Math.max(max,x);
        //     }

        //     ans.add(max);
        // }
        
        //  int[] result=new int[ans.size()];
        //  for(int f=0;f<ans.size();f++){
        //     result[f]=ans.get(f);
        //  }
        //  return result;

         Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];

        int j = 0;

        for(int i = 0; i < nums.length; i++) {

            // Remove elements outside the window
            if(!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements
            while(!deque.isEmpty() &&
                  nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Start storing answers when window reaches k
            if(i >= k - 1) {
                result[j++] = nums[deque.peekFirst()];
            }
        }

        return result;

    }
}