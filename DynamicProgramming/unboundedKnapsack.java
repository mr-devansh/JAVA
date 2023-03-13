package DynamicProgramming;

public class unboundedKnapsack {
    public static int doit(int val[], int wt[], int W) {
        int n= val.length;
        int dp[][] = new int[n+1][W+1];
        for (int i = 0; i < dp.length; i++) {
                dp[i][0]=0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=0;
    }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                int v = val[i-1];
                int w = wt[i-1];
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
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(doit(val, wt, W));
    }
}
