// TLE
// class Solution {
//     public int totalFruit(int[] fruits) {
//         int max=0;
//         for(int i=0;i<fruits.length;i++){
//             HashSet<Integer>set=new HashSet<>();
//             for(int j=i;j<fruits.length;j++){
//                 set.add(fruits[j]);

//                 if(set.size()>2){
//                     break;
//                 }
//                 max=Math.max(max,j-i+1);
//             }
            
//         }
//         return max;
//     }
// }

// class Solution {
//     public int totalFruit(int[] fruits) {
//         int i=0;
//         int j=0;
//         int max=0;
//         HashSet<Integer>set=new HashSet<>();
//         while(j<fruits.length){
//             set.add(fruits[j]);
//             while(set.size()>2){
//                 set.remove(fruits[i]);
//                 i++;
//             }
//             max=Math.max(max,j-i+1);
//             j++;
//         }
//         return max;
//     }
// }


// class Solution {
//     public int totalFruit(int[] fruits) {
//         int i=0;
//         int j=0;
//         int max=0;
//         HashMap<Integer,Integer>map=new HashMap<>();
//         while(j<fruits.length){
//             map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
//             while(map.size()>2){
//                 map.put(fruits[i],map.get(fruits[i])-1);
//                 if(map.get(fruits[i])==0){
//                     map.remove(fruits[i]);
//                 }
//                 i++;
//             }
//             max=Math.max(max,j-i+1);
//             j++;
//         }
//         return max;
//     }
// }

// class Solution {
//     public int totalFruit(int[] fruits) {
//         int i=0;
//         int j=0;
//         int max=0;
//         HashMap<Integer,Integer>map=new HashMap<>();
//         while(j<fruits.length){
//             map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
//             while(map.size()>2){
//                 map.put(fruits[i],map.get(fruits[i])-1);
//                     if(map.get(fruits[i])==0){
//                         map.remove(fruits[i]);
//                     }
//                     i++;
                
//             }
//             max=Math.max(max,j-i+1);
//             j++;
//         }
//         return max;
//     }
// }


// class Solution {
//     public int totalFruit(int[] fruits) {


//         int max=0;
//         for(int i=0;i<fruits.length;i++){
//             HashSet<Integer>set=new HashSet<>();
//             for(int j=i;j<fruits.length;j++){
//                 set.add(fruits[j]);
//                 if(set.size()>2){
//                     break;
//                 }
                
//                 max=Math.max(max,j-i+1);
//             }
//         }
//         return max;
//     }
// }



class Solution {
    public int totalFruit(int[] fruits) {
        // by hashmap
        // sabka freq nikal lo agar grater then size aaya toh map.get(fruits[i],fruits[i]-1)
        int i=0;
        int j=0;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(j<fruits.length){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            while(map.size()>2){
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i])==0){   
                    map.remove(fruits[i]);
                }
                i++;
            }
            
            max=Math.max(max,j-i+1);
            j++;

        }
        return max;

    }
}

