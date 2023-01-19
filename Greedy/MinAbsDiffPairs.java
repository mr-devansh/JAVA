package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MinAbsDiffPairs {
    public static void doit(int[]A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < B.length; i++) {
            sum += Math.abs(A[i]-B[i]); 
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int[] B = {2,1,3};
        doit(A,B);
    }
}
