package DynamicProgramming;

public class rodCutting {
    public static int doit(int price[], int length[], int W) {
        int n= price.length;
        int dp[][] = new int[n+1][W+1];
        for (int i = 0; i < dp.length; i++) {
                dp[i][0]=0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=0;
    }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                int v = price[i-1];
                int w = length[i-1];
                if (w<=j) {
                    int a1 = v + dp[i][j-w];
                    int a2 = dp[i-1][j];
                    dp[i][j]=Math.max(a1, a2);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int price[] = {1,5,8,9,10,17,17,20};
        int length[] = {1,2,3,4,5,6,7,8};
        int W = 8;
        int dp[][] = new int[price.length+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(doit(price, length, W));
    }
}
