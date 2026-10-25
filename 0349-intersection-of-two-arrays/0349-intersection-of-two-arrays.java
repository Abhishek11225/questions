class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    //     HashSet<Integer>set=new HashSet<>();
    //     for(int ele1:nums1){
    //         set.add(ele1);
    //     }
    //     HashSet<Integer>set1=new HashSet<>();
    //     for(int two:nums2){
    //         if(set.contains(two)){
    //         set1.add(two);

    //     }      

    // }
    // int ans[]=new int[set1.size()];
    //     int i=0;
    //     for(int op:set1){
    //         ans[i]=op;
    //         i++;
    //     }
      
    //   return ans;
    // class Solution {
    // public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
           map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j])) {
                ans.add(nums2[j]);
                map.remove(nums2[j]);
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
// }
// }