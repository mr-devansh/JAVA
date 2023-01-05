package backtracking;

public class sudokuSolver {

    public static void print(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(int[][] sudoku, int i, int j, int val) {
        for (int k = 0; k <= 8; k++) {
            if (sudoku[k][j]==val) {
                return false;
            }
        }
        for (int k = 0; k <= 8; k++) {
            if (sudoku[i][k]==val) {
                return false;
            }
        }
        int sr = (i/3)*3;
        int cr = (j/3)*3;
        for (int k = sr; k < sr+3; k++) {
            for (int k2 = cr; k2 < cr+3; k2++) {
                if (sudoku[k][k2]==val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solver(int[][] sudoku, int i, int j) {
        if (i==9) {
            return true;
        }
        int nextRow = i, nextCol = j+1;
        if (j+1==9) {
            nextRow = i+1;
            nextCol = 0;
        }
        if (sudoku[i][j]!=0) {
            return solver(sudoku, nextRow, nextCol);
        }
        for (int j2 = 1; j2 <= 9; j2++) {
            if (isSafe(sudoku, i, j, j2)) {
                sudoku[i][j] = j2;
                if(solver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[i][j]=0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        if(solver(sudoku, 0, 0)){
            print(sudoku);
        }else{
            System.out.println("No solution!");
        }
    }
}
