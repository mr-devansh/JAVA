package Loops;

public class prime {
    public static void main(String[] args) {
        int n = 8;
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("prime");     
        } else {
            System.out.println("not prime");     
        }
    }
}
