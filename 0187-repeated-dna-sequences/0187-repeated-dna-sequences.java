// // class Solution {
// //     public List<String> findRepeatedDnaSequences(String s) {
// //         HashSet<String>result=new HashSet<>();
// //         HashSet<String>set=new HashSet<>();
        

// //         // i tab tak chalega jab tak n-l 
// //         // where,
// //         // n=s.length(); and l=10;
// //         int n=s.length();
// //         int length=10;
// //         for(int i=0;i<=n-length;i++){
// //             //0 se 9 matlab 10 tak hi check kro
// //             String str=s.substring(i,i+length);

            
                
// //                 if(set.contains(str)){
// //                     result.add(str);
// //                 }
// //                 set.add(str);
// //             }
// //             return new ArrayList<String>(result);
// //         }
        
// //     }

// class Solution {
//     public List<String> findRepeatedDnaSequences(String s) {
//         HashSet<String>set=new HashSet<>();
//         HashSet<String>result=new HashSet<>();
//         int length=10;
//         int n=s.length();
//         for(int i=0;i<n-length;i++){
//             String str=s.substring(i,i+length);
//             if(set.contains(str)){
//                 result.add(str);
//             }
//             set.add(str);

//         }
//         return new ArrayList<>(result);
//     }
// }


// class Solution {
//     public List<String> findRepeatedDnaSequences(String s) {
//         HashSet<String>set=new HashSet<>();
//         HashSet<String>result=new HashSet<>();
//         int n=s.length();
//         int length=10;
//         for(int i=0;i<n-length;i++){
//             String str=s.substring(i,i+length);
//             if(set.contains(str)){
//                 result.add(str);
//             }
//             set.add(str);
//         }
//         return new ArrayList<>(result);
//     }
// }




class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String>set=new HashSet<>();
        HashSet<String>result=new HashSet<>();
        int length=10;
        int n=s.length();
        for(int i=0;i<=n-length;i++){
            String strr=s.substring(i,i+length);
            if(set.contains(strr)){
                result.add(strr);
            }
            set.add(strr);
        }
        return new ArrayList<>(result);

    }
}



















