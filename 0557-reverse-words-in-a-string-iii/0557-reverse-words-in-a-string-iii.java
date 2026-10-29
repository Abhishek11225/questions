class Solution {
    public String reverseWords(String s) {
        String []arr=s.split(" ");
        // array bn gya
        int index=0;

        for(String op:arr){
            char[]nums=op.toCharArray();
            int start=0;
            int end=nums.length-1;

            while(start<end){
                char temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            arr[index]=new String(nums);
            index++;
        }
    String ans=String.join(" ",arr);
    return ans;
    }
}