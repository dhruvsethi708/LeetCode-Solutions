class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                
                if(board[i][j]==word.charAt(0) && findstring(board, i, j, visited, word, 0)){
                    return true;
                }
            }
        }
        
        return false;
        
    }
    
    boolean findstring(char[][] board, int i, int j, boolean[][] visited, String word, int idx){
        
        if(idx>word.length()-1){
            return true;
        }
        
        if(i<0 || i>board.length-1 || j<0 || j>board[i].length-1 || board[i][j]!=word.charAt(idx) || visited[i][j] || word.length()>board.length*board[i].length){
            return false;
        }
        
        visited[i][j] = true;
        if(findstring(board, i-1, j, visited, word, idx+1)){
            return true;
        }
        if(findstring(board, i+1, j, visited, word, idx+1)){
            return true;
        }
        if(findstring(board, i, j-1, visited, word, idx+1)){
            return true;
        }
        if(findstring(board, i, j+1, visited, word, idx+1)){
            return true;
        }
        
        visited[i][j] = false;
        
        return false;
    }
}