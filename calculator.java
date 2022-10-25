import java.util.*;
public class calculator {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            float a = sc.nextFloat();
            System.out.print("Enter second number: ");
            float b = sc.nextFloat();
            System.out.print("Enter an operation(+, -, *, /): ");
            String c = sc.next();
            float ans = 0;
            switch (c) {
                case "+":
                    ans = a+b;
                    break;
                case "-":
                    ans = a-b;
                    break;
                case "*":
                    ans = a*b;
                    break;
                case "/":
                    ans = a/b;
                    break;
                default:
                    break;
            }
            System.out.println("The result is: "+ans);
        }
    }
}
