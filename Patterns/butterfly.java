package Patterns;

public class butterfly {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 10-(2*i); j++) {
                System.out.print("- ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i+1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (2*(i-1)); j++) {
                System.out.print("- ");
            }
            
            for (int j = 1; j <= 5-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
