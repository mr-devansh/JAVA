package TwoArrays;

public class diagonalSum {
    // brute force with O(n^2)
    // public static int print(int[][] args) {
    //     int sum = 0;
    //     for (int i = 0; i < args.length; i++) {
    //         for (int j = 0; j < args[0].length; j++) {
    //             if (i==j) {
    //                 sum+=args[i][j];
    //             }
    //             else if (i+j==args.length-1) {
    //                 sum+=args[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    // O(n)
    public static int print(int[][] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i][i];
            if (i != args.length-1-i) {
                sum+=args[i][args.length-i-1];                
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(print(arr));
    }
}
