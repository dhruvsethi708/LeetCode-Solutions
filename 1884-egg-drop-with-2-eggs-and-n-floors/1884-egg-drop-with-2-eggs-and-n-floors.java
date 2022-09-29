class Solution {
    public int twoEggDrop(int n) {
        
        int k = 2;
        
        int dp[][] = new int[k+1][n+1];
        
        for(int i = 1; i<=k; i++){
            for(int j = 1; j<=n; j++){
                
                if(i==1){
                    dp[i][j] = j;
                }else if(j==1){
                    dp[i][j] = 1;
                }else{
                    int min = Integer.MAX_VALUE;
                    
                    for(int mj=j-1, pj=0; mj>=0; mj--, pj++){
                        int v1 = dp[i][mj];
                        int v2 = dp[i-1][pj];
                        int val = Math.max(v1,v2);
                        min = Math.min(val, min);
                    }
                    
                    dp[i][j] = min+1;
                }
            }
        }
        
        return dp[k][n];
    }
}