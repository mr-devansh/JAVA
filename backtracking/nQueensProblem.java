package backtracking;

public class nQueensProblem {
    public static boolean isSafe(char[][] board, int i, int j) {
        for (int j2 = i-1; j2 >=0; j2--) {
            if (board[j2][j]=='Q') {
                return false;
            }
        }
        for (int j2 = i-1,j3 = j-1; j2 >=0 && j3>=0; j2--, j3--) {
            if (board[j2][j3]=='Q') {
                return false;
            }
        }
        for (int j2 = i-1, j3 = j+1; j2 >=0 && j3 < board.length; j2--, j3++) {
            if (board[j2][j3]=='Q') {
                return false;
            }
        }
        return true;
    }
    public static void print(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void nQueens(char[][] board, int row){
        if (row==board.length) {
            print(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQueens(board, row+1);
                board[row][j]='X';
            }
        }
    }
    public static void main(String[] args) {
        int n= 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        nQueens(board, 0);
    }
}
