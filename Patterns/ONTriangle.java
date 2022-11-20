package Patterns;

public class ONTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int num;
            if (i % 2 == 0) {
                num = 0;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num);
                    num = (num == 0) ? 1 : 0;
                }
            } 
            else {
                num = 1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num);
                    num = (num == 0) ? 1 : 0;
                }
            }
            System.out.println();
        }
    }
}