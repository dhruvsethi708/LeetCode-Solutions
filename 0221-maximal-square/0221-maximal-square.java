class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] dp = new int[m][n];
        int max = 0;
        
        for(int i = m-1; i>=0; i--){
            for(int j = n-1; j>=0; j--){
                
                if(matrix[i][j] == '1'){
                    int min = Integer.MAX_VALUE;
                    
                    if(i+1<m && j+1<n){
                        min = Math.min(min, dp[i+1][j]);
                        min = Math.min(min, dp[i+1][j+1]);
                        min = Math.min(min, dp[i][j+1]);
                        dp[i][j] = min+1;
                    }else{
                        dp[i][j] = 1;
                    }
                }else{
                    dp[i][j] = 0;
                }
                
                max = Math.max(max, dp[i][j]);
            }
        }
        
        return max*max;

    }
}