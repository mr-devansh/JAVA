import java.util.Scanner;
    

public class sumOfDigits {
    int func(int a){
        int sumy = 0;
        while (a>0) {
            int digit = a%10;
            sumy=sumy+digit;
            a=a/10;
        }
        return sumy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int a = sc.nextInt();
        sumOfDigits obj = new sumOfDigits();
        System.out.println(obj.func(a)); 
    }
}
