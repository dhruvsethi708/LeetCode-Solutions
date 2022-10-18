class NumMatrix {

    int[][] dp;
    public NumMatrix(int[][] matrix) {
        
        if(matrix.length==0 || matrix[0].length==0) return;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        dp = new int[rows+1][cols+1];
        
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                dp[i+1][j+1] = matrix[i][j] + dp[i][j+1] + dp[i+1][j] - dp[i][j];
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2+1][col2+1] - dp[row2+1][col1] - dp[row1][col2+1] + dp[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */