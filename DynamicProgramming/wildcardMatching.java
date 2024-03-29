package DynamicProgramming;

public class wildcardMatching {
    public static boolean doit(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean dp[][] = new boolean[n+1][m+1];

        dp[0][0] = true;

        for (int i = 1; i < n+1; i++) {
            if (p.charAt(i-1)=='*') {
                dp[0][i] = dp[0][i-1];
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    dp[i][j] = dp[i-1][j]||dp[i][j-1];
                }
                else{
                    dp[i][j]=false;
                }                
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "**d";
        System.out.println(doit(s1,s2));
    }
}
