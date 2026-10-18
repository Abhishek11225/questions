class Solution {
    public int maxVowels(String s, int k) {
        char[]nums=s.toCharArray();
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(isvowels(nums[i])){
                count++;
            }
        }
        max=Math.max(max,count);
        for(int j=k;j<nums.length;j++){
            if(isvowels(nums[j-k])){
                count--;
            }
            if(isvowels(nums[j])){
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
    static boolean isvowels(char ch){
        return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u';
    }
    
}