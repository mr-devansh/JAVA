package DynamicProgramming;

public class targetSum {
    public static boolean doit(int num[], int tar) {
        boolean dp[][] = new boolean[num.length+1][tar+1];
        int n= num.length;
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= tar; j++) {
                int v = num[i-1];
                if (v<=j && dp[i-1][j-v]==true) {
                    dp[i][j]=true;    
                }
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        return dp[num.length][tar];
    }
    public static void main(String[] args) {
        int num[] = {4,2,7,1,3};
        int tar = 10;
        System.out.println(doit(num, tar));
    }
}
