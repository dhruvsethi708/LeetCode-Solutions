class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int minrow = 0;
        int mincol = 0;
        int maxrow = m-1;
        int maxcol = n-1;
        
        while(m*n>res.size()){
            
            // top wall
            for(int i = minrow , j = mincol; j<=maxcol && m*n>res.size(); j++){
                    res.add(matrix[i][j]);
            }
            minrow++;
            
            // right wall
            for(int i = minrow , j = maxcol; i<=maxrow && m*n>res.size(); i++){
                    res.add(matrix[i][j]);
            }
            maxcol--;
            
            // bottom wall
            for(int i = maxrow , j = maxcol; j>=mincol && m*n>res.size(); j--){
                    res.add(matrix[i][j]);
            }
            maxrow--;
            
            // left wall
            for(int i = maxrow , j = mincol; i>=minrow && m*n>res.size(); i--){
                    res.add(matrix[i][j]);
            }
            mincol++;
            
        }
        
        return res;
    }
}