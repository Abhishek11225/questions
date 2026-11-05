class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        int max1=0;
        int max2=0;
        int ansop[]=new int [k];
        int f=0;

        for(int op:nums){
            map.put(op,map.getOrDefault(op,0)+1);
        }
        // ye keyset ko sort karega freq ke accodiung
        ArrayList<Integer>ans=new ArrayList<>(map.keySet());

        ans.sort((a,b)->map.get(b)-map.get(a));
for( int i=0;i<k;i++){
    ansop[i]=ans.get(i);
}


    return ansop;   
        
    }
}