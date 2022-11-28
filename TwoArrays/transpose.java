package TwoArrays;

public class transpose {
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Trans(int[][] arr) {
        System.out.println("Original: ");
        print(arr);
        int transpose[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose: ");
        print(transpose);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,7},{4,5,6}};
        Trans(arr);
    }
}
