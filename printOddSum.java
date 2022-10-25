import java.util.Scanner;
public class printOddSum {
    public static void odd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("The sum of all odd numbers between 0 and "+n+" is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        odd(n);
    }
}
