package divideAndConquer;

public class quickSortSorting {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int[] arr, int s, int e) {
        if(s>=e){
            return;
        }
        int pid = partition(arr, s, e);
        quickSort(arr, s, pid-1);
        quickSort(arr, pid+1, e);
    }
    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s-1;
        for (int j = s; j < e; j++) {
            if (arr[j]<= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = temp;
        return i;
        }
    
    public static void main(String[] args) {
        int[] arr = {3,6,5,7,3,4,9,1};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
