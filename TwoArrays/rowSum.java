package TwoArrays;

public class rowSum {
    public static void print(int[][] arr, int row) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[row][i];
        }
        System.out.println("Sum of all elements in row "+row+" is "+sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,7},{4,5,6},{7,8,9}};
        int row = 2;
        print(arr, row);
    }
}
