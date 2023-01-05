package backtracking;

public class gridWays {
    public static void print(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int gridways(int i, int j, int n, int m){
        if (i==n-1 && j == m-1) {
            return 1;
        }else if(i == n || j == m){
            return 0;
        }
        int w1 = gridways(i+1, j, n, m);
        int w2 = gridways(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n= 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        System.out.println(gridways(0,0,3,3)); gridways(0,0,3,3);
    }
}
// O(2 power(n+m)) exponential time

// so we can solve this is linear time using mathematical formula
// permutation
// ((n-1+m1)!)/((n-1)!(m-1)!)

