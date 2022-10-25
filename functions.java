import java.util.*;
public class functions {
    public static int sumPrint(int n1, int n2) {
        return n1+n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2 number: ");
        int n2 = sc.nextInt();
        System.out.println("sum= "+sumPrint(n1, n2)); 
    }
}
