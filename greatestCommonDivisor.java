import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = n1;
        int y = n2;
        while (n1 != n2) {
            if (n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }
        System.out.print("GCD of "+x+" and "+y+" is: " + n2);
    }
}
