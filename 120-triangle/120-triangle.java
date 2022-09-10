class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n = triangle.size();
        int[][] dp = new int[n][n];
        
        int row = 0;
        int col = 0;
        
        dp[0][0] = triangle.get(row).get(col);
        
        row = 1;
        
        while(row<n){
            if(row!=0 && col==0){
                dp[row][0] = dp[row-1][0] + triangle.get(row).get(col);
                col++;
            }else if(row!=0 && col== triangle.get(row).size()-1){
                dp[row][col] = dp[row-1][col-1] + triangle.get(row).get(col);
                row++;
                col = 0;
            }else{
                
                dp[row][col] = Math.min(dp[row - 1][col], dp[row - 1][col -1]) +  triangle.get(row).get(col);
                col++;
            }
        }
        
        int result = Integer.MAX_VALUE; 
        
        for(int i = 0; i < n; i ++) {
            result = Math.min(dp[dp.length - 1][i], result);
        }
        
        return result;
    }
}