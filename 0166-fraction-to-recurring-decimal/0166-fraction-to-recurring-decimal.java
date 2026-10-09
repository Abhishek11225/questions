class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0){
            return "0";
        }
        StringBuilder ans=new StringBuilder();
        if(numerator<0!=denominator<0){
            ans.append("-");
        }
        // isse dono numerator and dinominator ko positive bna rhe h aur negative wala case toh uper hi sahi kr lioya tha
        long a=Math.abs((long)numerator);
        long b=Math.abs((long)denominator);
        ans.append(a/b);
        long rem=a%b;
        if(rem==0){
            return ans.toString();
        }
        ans.append(".");
        HashMap<Long,Integer>map=new HashMap<>();
        while(rem!=0){
            if(map.containsKey(rem)){
                ans.insert(map.get(rem),"(");
                ans.append(")");
                break;
            }
            map.put(rem,ans.length());
            rem=rem*10;
            ans.append(rem/b);
            rem=rem%b;
        }
        return ans.toString();
    }
}