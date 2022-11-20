package Loops;

import java.util.Scanner;
public class continueStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter number: ");
            int n = sc.nextInt();
            if (n%10==0) {
                continue;
            }
            System.out.println("Number entered: "+n);
        } while (true);
    }
}
