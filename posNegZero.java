import java.lang.reflect.Array;
import java.util.Scanner;
public class posNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want to enter: ");
        int n = sc.nextInt();
        int pos = 0;
        int neg = 0;
        int zer = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            if(a>0){
                pos++;
            }
            else if(a==0){
                zer++;
            }
            else{
                neg++;
            }
        }
        System.out.println("Positive: "+pos+", Negative: "+neg+", Zeros: "+zer);
    }
}
