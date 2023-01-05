package Recursion;

public class duplicates {
    public static void check(int[] arr, int key, int i) {
        if (i==arr.length) {
            return;
        }
        if (arr[i]==key) {
            System.out.print(i+" ");
        }
        check(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5,6,3,7,8,9,3,10};
        int key = 3;
        check(arr, key, 0);
    }
}
