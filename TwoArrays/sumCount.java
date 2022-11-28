
package TwoArrays;

public class sumCount {
    public static void print(int[][] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==key) {
                    count++;
                }
            }
        }
        System.out.println("The key "+key+" is found "+count+" times.");
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,7},{4,5,6},{7,8,9}};
        int key = 7;
        print(arr, key);
    }
}
