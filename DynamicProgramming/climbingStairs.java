package DynamicProgramming;

import java.util.Arrays;

public class climbingStairs {
     public static int doit(int n) {
          // tabulation
          if (n == 0) {
               return 1;
          }
          if (n < 0) {
               return 0;
          }
          return doit(n - 1) + doit(n - 2);
     }

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
          ways[n] = doit(n - 1) + doit(n - 2);
          return ways[n];
     }

     public static void main(String[] args) {
          int n = 5;
          int ways[] = new int[n+1];
          Arrays.fill(ways, -1);
          System.out.println(doit(n, ways));
     }
}
