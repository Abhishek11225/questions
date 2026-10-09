class Solution {
    public int maxProfit(int[] prices) {
        int bestT=prices[0];
        int maxP=0;
        int returns=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<bestT){
                bestT=prices[i];
            }
            if(prices[i]>bestT){
                returns=prices[i]-bestT;
                maxP=Math.max(maxP,returns);
            }
        }
        return maxP;

    }
}