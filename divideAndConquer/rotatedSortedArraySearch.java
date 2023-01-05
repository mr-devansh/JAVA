package divideAndConquer;

public class rotatedSortedArraySearch {
    public static int search(int[] arr, int target, int s, int e) {
        int mid = s + (e-s)/2;
        if (arr[mid]==target) {
            return mid;
        }
        if (arr[s]<=arr[mid]) {
            if (arr[s]<=target && target<=arr[mid]) {
                return search(arr, target, s, mid);
            }else{
                return search(arr, target, mid+1, e);
            }
        }else{
            if (arr[mid]<=target && target<=arr[e]) {
                return search(arr, target, mid+1, e);
            }else{
                return search(arr, target, s, mid-1);
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length-1)); 
    }
}
