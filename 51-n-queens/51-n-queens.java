class Solution {
    public List<List<String>> solveNQueens(int n) {
        char maze[][] = new char[n][n];
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                maze[i][j] = '.';
            }   
        }
        
        List<List<String>> result = new ArrayList<>();
        
        queens(maze,0,result);
        return result;
    }
    
    
    void queens(char[][] maze, int row, List<List<String>> result){
        
        if(row==maze.length){
            List<String> list = new ArrayList<>();
            
            for(int i = 0; i<maze.length; i++){
                String s = new String(maze[i]);
                list.add(s);
            }
            result.add(list);
            return;
            
        }
        
        for(int col = 0; col<maze.length; col++){
            if(isSafe(maze,row,col)){
                
                maze[row][col] = 'Q';
                queens(maze, row+1, result);
                maze[row][col] = '.';
            }

        }
    }
    
    boolean isSafe(char[][] maze, int row, int col){
        for(int i = row-1,j=col; i>=0; i--){
            if(maze[i][j]=='Q'){
                return false;
            }
        }
        
        for(int i = row-1,j=col-1; i>=0&&j>=0; i--,j--){
            if(maze[i][j]=='Q'){
                return false;
            }
        }
        
        for(int i = row-1,j=col+1; i>=0&&j<maze.length; i--,j++){
            if(maze[i][j]=='Q'){
                return false;
            }
        }
        
        return true;
    }
    
    
}