class Solution {
    public int maxProfit(int[] prices) {
        
        int minsofar = prices[0];
        int profit = 0;
        
        for(int i = 0; i<prices.length; i++){
            
            if(prices[i]<minsofar){
                minsofar = prices[i];
            }
            int diff = prices[i] - minsofar;
            
            if(diff>profit){
                profit = diff;
            }
        }
        return profit;
    }
}