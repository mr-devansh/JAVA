package DynamicProgramming;

public class longestCommonSubstring{
    // public static int doit(String s1, int l1, String s2, int l2) {
    //     if (l1==0||l2==0) {
    //         return 0;
    //     }
    //     if (s1.charAt(l1-1)==s2.charAt(l2-1)) {
    //         return doit(s1, l1-1, s2, l2-1)+1;
    //     }
    //     else{
    //         return Math.max(doit(s1, l1-1, s2, l2), doit(s1, l1, s2, l2-1));
    //     }
    // }

    // //memoization
    // public static int doit(String s1, int l1, String s2, int l2, int dp[][]) {
    //     if (l1==0||l2==0) {
    //         return 0;
    //     }
    //     if (dp[l1][l2]!=-1) {
    //         return dp[l1][l2];
    //     }
    //     if (s1.charAt(l1-1)==s2.charAt(l2-1)) {
    //         return dp[l1][l2] = doit(s1, l1-1, s2, l2-1)+1;
    //     }
    //     else{
    //         return Math.max(doit(s1, l1-1, s2, l2), doit(s1, l1, s2, l2-1));
    //     }
    // }

    //tabulation: create table, meaning+initialization, fill bottom to up.
    public static int doit(int dp[][], String s1, int l1, String s2, int l2) {
        int ans = 0;
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                    ans = Math.max(ans, dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abgce";

        int l1 = s1.length();
        int l2 = s2.length();

        // System.out.println(doit(s1,l1,s2,l2));

        
        // int dp[][] = new int[l1+1][l2+1];
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         dp[i][j]=-1;
        //     }
        // }
        // System.out.println(doit(s1,l1,s2,l2,dp));

        int dp2[][] = new int[l1+1][l2+1];
        for (int i = 0; i < dp2.length; i++) {
            for (int j = 0; j < dp2[0].length; j++) {
                dp2[i][j]=0;
            }
        }
        System.out.println(doit(dp2,s1,l1,s2,l2));
    }
}
