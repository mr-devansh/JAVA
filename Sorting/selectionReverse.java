package Sorting;

public class selectionReverse {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int[] arr) {
        for (int i = 0; i <= arr.length-1; i++) {
            int l = i;
            for (int j = i+1; j <= arr.length-1; j++) {
                if (arr[j]>arr[l]) {
                    l=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] ={4,5,3,2,5,5,3,3,9,22,0,11,7};
        sort(arr);
        print(arr);
    }
}
