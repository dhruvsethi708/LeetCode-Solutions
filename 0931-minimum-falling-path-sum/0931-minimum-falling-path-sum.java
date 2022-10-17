class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int m = matrix.length;

        if(m == 1){
            return matrix[0][0];
        }
        
        int[][] dp = new int[m][m];
        
        for(int j = 0; j<m; j++){
            dp[0][j] = matrix[0][j];
        }
        
        for(int i = 1; i<m; i++){
            for(int j = 0; j<m; j++){
                
                if(j==0) dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], dp[i-1][j+1]);
                else if(j==m-1) dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], dp[i-1][j-1]);
                else dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], Math.min(dp[i-1][j-1],dp[i-1][j+1]));
                
            }
        }
        
        int minsum = Integer.MAX_VALUE;
        for(int j = 0; j<m; j++){
            minsum = Math.min(minsum, dp[m-1][j]);
        }
        
        return minsum;
    }
}