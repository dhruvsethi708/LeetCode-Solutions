class Solution {
    public int maxProfit(int k, int[] prices) {
        
        int dp[][] = new int[k+1][prices.length];
        
        for(int t = 1; t<k+1; t++){
            for(int d = 1; d<prices.length; d++){
                int max = dp[t][d-1];
                
                for(int pd = 0; pd<d; pd++){
                    int ptilltm1 = dp[t-1][pd];
                    int ptth = prices[d] - prices[pd];
                    
                    if(ptilltm1 + ptth > max){
                        max = ptilltm1 + ptth;
                    }
                }
                
                dp[t][d] = max;
            }
        }
        
        return dp[k][prices.length-1];
    }
}