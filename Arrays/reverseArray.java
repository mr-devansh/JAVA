// package Arrays;

public class reverseArray {
    public static void reverse(int arr[]) {
        int f=0, l=arr.length-1;
        while (f < l) {
        // here = not used as first and last in mid would be same
            int temp= arr[l];
            arr[l]=arr[f];
            arr[f]=temp;
            f+=1;
            l-=1;
        }
    }
    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        reverse(arr);
        print(arr);
    }
}
