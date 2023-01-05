package Recursion;

public class NFibonacci {
    public static int func(int n) {
        if (n==1 || n==0) {
            return n;
        }
        return func(n-1)+func(n-2);
    }
    public static void main(String[] args) {
        System.out.println(func(7)); 
    }
}
// 2 power n time
// n space space 