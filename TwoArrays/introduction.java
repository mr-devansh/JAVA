package TwoArrays;
import java.util.Scanner;
public class introduction {
    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean find(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==key) {
                    System.out.print("Found at index "+i+", "+j);                    
                    return true;
                }
            }
        }
        System.out.println("Not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc  = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        print(matrix);
        find(matrix, 9);
    }
}
