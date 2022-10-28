public class selectionSort {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < arr.length-1; i++) {
            int small = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[small]) {
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }
}
