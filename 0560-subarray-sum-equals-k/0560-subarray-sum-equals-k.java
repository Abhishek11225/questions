class Solution {
    public int subarraySum(int[] nums, int k) {
        //  brute force
//  int sum=0;
//  int count=0;
// //  int f=1;
//  int i=0;
//  int j=0;
//  int max=nums.length-1;
//  if(nums[max]==k){
//     count=1;
//  }

//  while(j<nums.length){

//     sum+=nums[j];

//     while(sum==k){
//         count++;
//         // max=Math.max(max,count);
//         sum-=nums[i];
//         i++;
      
        

//     }

// j++;

//  }

// return count;




// brute force number 2;


int count=0;

for( int i=0;i<nums.length;i++){
    int sum=0;
    for(int j=i;j<nums.length;j++){
        sum+=nums[j];
        if(sum==k){
            count++;
            break;
        }
    }
}
return count;
    }
}







