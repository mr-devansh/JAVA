package Patterns;

public class hollowRhombus {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 5-i+1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 5; j++) {
                if (j==0||j==4||i==1||i==5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


