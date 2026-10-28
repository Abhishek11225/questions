class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j=0;j<t.length();j++){
        //     if(!map.containsKey(t.charAt(j))){
        //         return t.charAt(j);
        //     }
        // }
        // return t.charAt(t.length()-1);


        int freq=map.getOrDefault(t.charAt(j),0);


        if(freq==0){
            return t.charAt(j);
        }
        map.put(t.charAt(j),freq-1);
    }
    return ' ';
}
}