package Patterns;
public class floydTriangle {
    public static void main(String[] args) {
        int z = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(z+" ");
                z++;
            }
            System.out.println();
        }
    }
}
