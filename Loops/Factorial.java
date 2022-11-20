package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prod = 1;
        int n = sc.nextInt();
        while(n!=1){
            prod*=n;
            n--;
        }
        System.out.println(prod);
    }
}
