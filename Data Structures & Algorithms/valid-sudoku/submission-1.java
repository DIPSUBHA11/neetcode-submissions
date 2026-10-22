class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board);
    }

    public boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                   if(!isCorrect(board,i,j,board[i][j])){
                    return false;
                   }
                }
            }
        }
        return true;
    }

    public boolean isCorrect(char[][] board, int row, int col, char k) {
        for (int i = 0; i < 9; i++) {
            if (i != col && board[row][i] == k) {
                return false;
            }
            if (i != row && board[i][col] == k) {
                return false;
            }
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;

            if ((boxRow != row || boxCol != col) &&
                board[boxRow][boxCol] == k) {
                return false;
            }
        }
        return true;
    }
}
