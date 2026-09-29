class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        int []ans=new int[nums1.length+nums2.length];
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                ans[k]=nums1[i];
                i--;
                k--;
            }
            else{
                ans[k]=nums2[j];
                j--;
                k--;
            }
        }
        while(i >= 0) {
    ans[k--] = nums1[i--];
}

while(j >= 0) {
    ans[k--] = nums2[j--];
}
        int start=0;
        int end=ans.length-1;
        int mid=start+(end-start)/2;
        if(ans.length % 2 == 1) {
    return ans[mid];
} else {
    return (ans[mid] + ans[mid + 1]) / 2.0;
}

    }
}