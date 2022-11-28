package Sorting;

public class countingReverse {
    public static void println(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int[] arr) {
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            l = Math.max(l, arr[i]);
        }
        int count[] = new int[l+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int z = 0;
        for (int i = count.length; i <= 0; i--) {
            while (count[i]>0) {
                arr[z]=i;
                z++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,6,7,3,3,3,2,1,0};
        sort(arr);
        println(arr);
    }
}
