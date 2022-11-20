package Loops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=0, n, even=0, odd=0;
        do {
            System.out.print("Enter number: ");
            n = sc.nextInt();
            if (n%2==0) {
                even++;
            } else {
                odd++;
            }
            System.out.print("Enter choice (0 to continue, 1 to exit): ");
            choice = sc.nextInt();
        } while (choice == 0);
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
