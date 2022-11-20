package Conditional;

import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int n3 = sc.nextInt();
        if ((n1>=n2)&&(n1>=n3)) {
                System.out.println(n1+" (n1) is greatest.");
            }
        else if (n2>n3) {
                System.out.println(n2+" (n2) is greatest.");
            } 
        else {
                System.out.println(n3+" (n3) is greatest.");
            }
    }
}
