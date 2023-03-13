package DynamicProgramming;

public class stringConversion {
    public static int doit(int dp[][], String s1, int l1, String s2, int l2) {
        int ans = 0;
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[l1][l2];
    }
    public static void mainDo(int dp[][], String s1, int l1, String s2, int l2) {
        int ans1 = doit(dp, s1, l1, s2, l2);
        System.out.println(ans1);
        System.out.println("deletions: "+(l1-ans1));
        System.out.println("additions: "+(l2-ans1));
    }
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "aceg";
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        mainDo(dp, s1, m, s2, n);
    }
}
