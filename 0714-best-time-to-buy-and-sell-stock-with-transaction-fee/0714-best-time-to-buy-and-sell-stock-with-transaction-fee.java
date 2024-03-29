class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int bsp = -prices[0];
        int ssp = 0;
        
        for(int i = 1; i<prices.length; i++){
            
            int nbsp = ssp - prices[i];
            int nssp = bsp + prices[i] - fee;
            
            if(nbsp>bsp){
                bsp = nbsp;
            }
            
            if(nssp>ssp){
                ssp = nssp;
            }
        }
        
        return ssp;
    }
}