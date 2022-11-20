import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n>=1) {
            sum+=n;
            n--;
        }
        System.out.println(sum);
    }
}
