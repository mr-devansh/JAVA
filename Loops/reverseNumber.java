package Loops;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int l = 0;
        int n2 = 0;
        while (n1!=0) {
            l = n1%10;
            n2 = (n2*10)+l;
            n1=n1/10;
        }
        System.out.println(n2);
    }
}
