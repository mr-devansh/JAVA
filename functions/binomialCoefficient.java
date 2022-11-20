import java.util.Scanner;

public class binomialCoefficient {
    int fact(int a){
        int facto = 1;
        for (int i = 2; i < a+1; i++) {
            facto*=i;
        }
        return facto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        factorial obj = new factorial();
        int ans = obj.facto(n)/(obj.facto(r)*obj.facto(n-r));
        System.out.println(ans);
    }
}
