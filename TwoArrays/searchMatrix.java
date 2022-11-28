package TwoArrays;

public class searchMatrix {
    public static boolean print(int[][] arr, int key) {
        int row = 0, col = arr[0].length-1;
        while (row<arr.length && col>=0) {
            if (arr[row][col]==key) {
                System.out.println("found at ("+row+", "+col+")");
                return true;
            }
            else if (key<arr[row][col]) {
                col--;
            }
            else{
                row++;
            } 
        } 
        System.out.println("Not found!");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int key = 8;
        print(arr, key);
    }
}
