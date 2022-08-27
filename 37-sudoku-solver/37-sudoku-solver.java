class Solution {
    public void solveSudoku(char[][] board) {
        solveSudoku(board, 0, 0, board.length);
    }
    
    boolean solveSudoku(char[][] board, int i, int j, int n){
        if(i == n)
            return true;
        if(j == n)
            return solveSudoku(board, i + 1, 0, n);
        if(board[i][j] != '.')
            return solveSudoku(board, i, j + 1, n);
        
        for(int number = 1; number <= n; number++){
            char charNumber = (char)(number + '0');
            if(canPlace(board, i, j, n, charNumber)){
                board[i][j] = charNumber;
                boolean success = solveSudoku(board, i, j + 1, n);
                if(success)
                    return true;
            }
        }
         board[i][j] = '.';
        return false;
    }
    
    boolean canPlace(char[][] board, int i, int j, int n, char number){
        for(int k = 0; k < n; k++){
            if(board[i][k] == number || board[k][j] == number)
                return false;
        }
        int sx = (i / 3) * 3;
        int sy = (j / 3) * 3;
        
        for(int x = sx; x < sx + 3; x++){
            for(int y = sy; y < sy + 3; y++){
                if(board[x][y] == number)
                    return false;
            }
        }
        return true;
    }
}