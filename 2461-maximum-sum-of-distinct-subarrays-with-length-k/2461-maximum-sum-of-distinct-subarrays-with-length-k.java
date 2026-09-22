// // This code will give u TLE
// // class Solution {
// //     public long maximumSubarraySum(int[] nums, int k) {
// //         int n=nums.length;
        
// //         long max=0;

// //         for(int i=0;i<=n-k;i++){
// //             HashSet<Integer>set=new HashSet<>();
// //             boolean isDup=false;
// //             long sum=0;
// //             for(int j=i;j<=i+k-1;j++){
// //                 if(set.contains(nums[j])){
// //                     isDup= true;
// //                     break;
// //                 }
// //                 set.add(nums[j]);
// //                 sum=sum+nums[j];
// //             }
// //             if(!isDup){
// //                 max=Math.max(sum,max);
// //             }
// //         }
// //         return max;
// //     }
// // }


// //  thora galat but mera Optimized solution

// // class Solution {
// //     public long maximumSubarraySum(int[] nums, int k) {
// //         // HashMap<Integer,Integer>map=new HashMap<>();
// //         long sum=0;
// //         long max=Long.MIN_VALUE;
// //         int dup=0;
// //         HashMap<Integer,Integer>map=new HashMap<>();
// //         for(int i=0;i<k;i++){

// //             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
// //             sum+=nums[i];

// //             if(map.get(nums[i]=1)){
// //                 dup++;
// //             }
            
// //         } 
// //         if(dup==0){
// //                 max=Math.max(sum,max);
// //         }

// //             for(int j=k;j<nums.length;j++){
// //                 int add=nums[i];
// //                 int remove=nums[i-k];

// //             map.put(add,map.getOrDefault(add,0)+1);
            
// //             sum+=add;

// //             if (map.get(remove) > 1) {
// //                 dup = dup --;
// //             }

// //             map.put(remove, map.get(remove) - 1);

// //             sum = sum - numToRemove;
// //             if(dup==0){
// //                 max=Math.max(sum,max);
// //             }

           
// //     }
// //      return max;
// // }
// // }






// // Sahi optimaized solution 
// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {

// //ek sum,aur max bna lete h aur dono ko 0 se initialize kr denge 
// long sum=0;
// long max =0;
// // ek HM banate h aur uska freq check karenge agar freq jada aaya toh duplicate badhadenge denge agar duplicate 0 h toh usko ans m store kr lenge aur check karenge max aur sum m kon bada h 
// int dups=0;
// HashMap<Integer,Integer>map=new HashMap<>();
// for (int i=0;i<k;i++){
//     int freq=map.getOrDefault(nums[i],0);

//     if(freq>0){
//         dups++;
//     }

//     map.put(nums[i],freq+1);
//     sum+=nums[i];
// }
// if(dups==0){
//     max=Math.max(sum,max);
// }
// for(int j=k;j<nums.length;j++){
//     int add=nums[j];

//     int remove=nums[j-k];

//     int freqAdd=map.getOrDefault(add,0);
//     if(freqAdd>0){
//         dups++;
//     }
//     map.put(add,freqAdd+1);
//     sum+=add;

//     int removeFreq=map.get(remove);
//     if(removeFreq>1){
//         dups--;
//     }
//     map.put(remove,removeFreq-1);
//     sum-=remove;
//     if(dups==0){
//         max=Math.max(sum,max);
//     }
// }
// return max;
//     }
// }

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        long max=0;
        int dups=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++){
            int freq=map.getOrDefault(nums[i],0);


            if(freq>0){
                dups++;
            }
            map.put(nums[i],freq+1);
            sum+=nums[i];
            
        }
        if(dups==0){
            max=Math.max(sum,max);
            }
            for(int j=k;j<nums.length;j++){
                int add=nums[j];
                int remove=nums[j-k];

                int addF=map.getOrDefault(add,0);

                if(addF>0){
                    dups++;
                }
                map.put(add, addF + 1);
                sum+=add;
                int removeF=map.get(remove);
                if(removeF>1){
                    dups--;
                }
                map.put(remove,removeF-1);
                sum-=remove;
                if(dups==0){
                    max=Math.max(max,sum);
                }
            }
            return max;

    }
}
