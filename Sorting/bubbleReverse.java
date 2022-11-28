package Sorting;

public class bubbleReverse {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int[] arr) {
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = 0; j <= arr.length-2-i; j++) {
                if (arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,2,1,3,5,6,4,3,0};
        sort(arr);
        print(arr);
    }
}
