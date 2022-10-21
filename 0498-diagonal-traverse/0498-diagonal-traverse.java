class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;

        int[] ans = new int[m*n];
        
        int i = 0;
        int row = 0;
        int col = 0;
        
        boolean up = true;
        
        while(row<m && col<n){
            
            if(up){
                while(row>0 && col<n-1){
                    ans[i] = mat[row][col];
                    i++;
                    row--;
                    col++;
                }
                ans[i] = mat[row][col];
                i++;
                
                if(col==n-1) row++;
                else col++;
            }else{
                
                while(col>0 && row<m-1){
                    ans[i] = mat[row][col];
                    i++;
                    row++;
                    col--;
                }
                ans[i] = mat[row][col];
                i++;
                
                if(row==m-1) col++;
                else row++;
            }
            
            up = !up;
        }

        return ans;
    }
}