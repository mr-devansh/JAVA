package DynamicProgramming;

import java.util.Arrays;

public class climbingStairs2 {

     public static int doit(int n, int[] ways) {
          //memoization
          if (n == 0) {
               return 1;
          }
          if (n < 0) {
               return 0;
          }
          if (ways[n]!=-1) {
               return ways[n];
          }
          ways[n] = doit(n - 1, ways) + doit(n - 2, ways);
          return ways[n];
     }

     public static int doit2(int n, int[] ways) {
          //tabulation
          ways[0]=1;
          for (int i = 1; i <= n; i++) {
               if(i==1)
                    ways[i] = ways[i-1];
               else
                    ways[i] = ways[i-1]+ways[i-2];

          }
          return ways[n];
     }

     public static void main(String[] args) {
          int n = 5;
          int ways[] = new int[n+1];
          Arrays.fill(ways, -1);
          System.out.println(doit2(n, ways));
     }
}
