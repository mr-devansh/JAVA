import java.util.*;
public class table_of_n {
    public static void main(String[] args) {
        System.out.print("Enter a number to print table of: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
