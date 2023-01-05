// package Arrays;

public class largestnumber {
    public static void main(String[] args) {
        int arr[] = {3,167,2,3,4,5,66,7,8,9,10};
        int largest = arr[0];
        for (int i : arr) {
            if (i>largest) {
                largest = i;
            }
        }
        System.out.println("Largest number is: "+largest);
    }
}
