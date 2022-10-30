class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet seen = new HashSet();
        // HashSet does not add duplicates
        
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                
                if(board[i][j] != '.'){
                    if(!seen.add("row" + i + board[i][j]) || !seen.add("col" + j + board[i][j])){
                        return false;
                    }

                    int boxindex = (i/3)*3 + j/3;

                    if(!seen.add("box" + boxindex + board[i][j])){
                        return false;
                    }

                    }
                
            }
        }
        
        return true;
    }
}