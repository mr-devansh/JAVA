package Loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int i = 1;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (i<=n) {
            sum+=i;
            i+=1;
        }
        System.out.println(sum);
    }
}
