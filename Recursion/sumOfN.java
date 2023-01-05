package Recursion;

public class sumOfN {
    public static int func(int a) {
        if (a==1) {
            return 1; 
        }
        return a+func(a-1);
    }
    public static void main(String[] args) {
        System.out.println(func(5)); 
    }
}
