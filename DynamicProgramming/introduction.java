package DynamicProgramming;

public class introduction {
    public static int fib(int n, int f[]) {
        if (n==0||n==1) {
            return n;
        }
        if (f[n]!=0) {
            return f[n];
        }
        f[n] = fib(n-1,f)+fib(n-2,f);
        return f[n];
    }
    public static void main(String[] args) {
        int n = 7;
        int f[] = new int[n+1];
        System.out.println(fib(n,f));
    }
}


// Dynamic Programming 
// done in two ways
// memorization: using memory, recursion, top down
// tabulation: make table, iteration, bottom up

// important questions
// fibonacci
// 0-1 knapsack
// unbounded knapsack
// longest common subsequence
// kadane algorithm
// catalan number
// DP on grid