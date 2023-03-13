package DynamicProgramming;

import java.util.Arrays;

public class catalanNumber {
    public static int method1(int n) {
        if (n==0||n==1) 
            return 1;
        int ans = 0;    
        for (int i = 0; i < n; i++) {
            ans+=method1(i)*method1(n-i-1);
        }
        return ans;
    }
    public static int method2(int n, int dp[]) {
        if (n==0||n==1) {
            return 1;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }            
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans+=method2(i,dp)*method2(n-i-1,dp);
        }
        return dp[n] = ans;
    }
    public static int method3(int n, int dp[]) {
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n1 = 10;
        System.out.println(method1(n1));

        int n2 = 10;
        int dp[] = new int[n2+1];
        Arrays.fill(dp, -1);
        System.out.println(method2(n2, dp));

        int n3 = 10 ;
        int dp2[] = new int[n2+1];
        System.out.println(method3(n3, dp2));
    }
}
