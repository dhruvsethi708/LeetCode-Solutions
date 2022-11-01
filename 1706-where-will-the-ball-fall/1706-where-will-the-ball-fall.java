class Solution {
    public int[] findBall(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        int [] ans = new int[n];
        for(int j = 0; j < n; j++){
            int cpos = j;
            int npos = -1;
            for(int i = 0; i < m; i++){
                npos = cpos + grid[i][cpos];
                if(npos < 0 || npos >= n || grid[i][cpos] != grid[i][npos]){
                    cpos = -1;
                    break;
                }
                cpos = npos;
            }
            ans[j] = cpos;
        }
        return ans;
    }
}