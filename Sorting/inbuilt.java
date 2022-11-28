package Sorting;

import java.util.Arrays;
import java.util.Collections;
// O(nlogn)
public class inbuilt {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void print(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,4,2};
        Arrays.sort(arr);
        print(arr);

        int arr2[] = {2,3,5,7,5,6,8,9,0,4,2};
        Arrays.sort(arr2, 0,4);
        print(arr2);

        Integer arr3[] = {2,3,5,7,4,2};
        Arrays.sort(arr3,Collections.reverseOrder());
        print(arr3);
        
        Integer arr4[] = {2,3,5,7,5,6,8,9,0,4,2};
        Arrays.sort(arr4, 0,4,Collections.reverseOrder());
        print(arr4);
    }
}
