package divideAndConquer;

public class inversionCount {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int[] arr, int s, int m, int e) {
        int temp[] = new int[e-s+1];
        int i = s;
        int j = m+1;
        int k = 0; 
        while (i<=m && j<=e) {
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=m) {
            temp[k++]=arr[i++];
        }
        while (j<=e){
            temp[k++]=arr[j++];
        }
        for (k = 0, i = s; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void mergesort(int[] arr, int s, int e) {
        if (s>=e) {
            return;
        }
        int mid = s + (e-s)/2;
        mergesort(arr, s, mid);
        mergesort(arr, mid+1, e);
        merge(arr, s, mid, e);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,6,3,7,2,8,1,9};
        mergesort(arr, 0, arr.length-1);
        print(arr);
    }
}

        
