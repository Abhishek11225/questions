class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[]s1=s.toCharArray();
        char[]s2=t.toCharArray();
        HashMap<Character,Integer>map1=new HashMap<>();
        for(char nums1:s1){
            map1.put(nums1,map1.getOrDefault(nums1,0)+1);

        }
         HashMap<Character,Integer>map2=new HashMap<>();
        for(char nums2:s2){
            map2.put(nums2,map2.getOrDefault(nums2,0)+1);
            
        }
        for(char traverse:map1.keySet()){
            if(!map1.get(traverse).equals(map2.getOrDefault(traverse,0))){
                return false;
            }
        }
        return true;
        

    }
}