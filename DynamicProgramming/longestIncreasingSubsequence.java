package DynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;

public class longestIncreasingSubsequence {
    public static int lcs(int arr[], int newArr[]) {
        int n = arr.length;
        int m = newArr.length;
        int dp[][] = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i-1]==newArr[j-1]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    
                }
            }
        }
        return dp[n][m];
    }
    public static int doit(int arr[]) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }
        int newArr[] = new int[h.size()];
        int ind = 0;
        for (int i : h) {
            newArr[ind]=i;
            ind++;
        }
        Arrays.sort(newArr);
        return lcs(arr,newArr);
    }
    public static void main(String[] args) {
        int lis[] = {50,3,10,7,40,80};
        System.out.println(doit(lis));
    }
}
