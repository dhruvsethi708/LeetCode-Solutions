class Solution {
    public int integerBreak(int n) {
        
        if(n==2) return 1;
        if(n==3) return 2;
        
        int[] dp = new int[n+1];
        
        for(int i = 0; i<n+1; i++){
            if(i==0) dp[i]=0;
            else if(i==1) dp[i]=1;
            else if(i==2) dp[i]=2;
            else if(i==3) dp[i]=3;
            else{
                for(int j = 1; j<i; j++){
                    int temp = i-j;
                    int prod = j*dp[temp];
                    dp[i] = Math.max(prod, dp[i]);
                }
            }

        }
        
        return dp[n];
    }
}