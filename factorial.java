import java.util.Scanner;

public class factorial {
    public static void factorial(int n) {
        if (n < 0) {
            System.err.println("Enter a positive number!");
            return;
        }
        int x = n;
        int z = 1;
        while (n >= 1) {
            z = z * n;
            n--;
        }
        System.out.println("factorial of " + x + " is " + z);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();
        factorial(n1);
    }
}
