package divideAndConquer;

public class dominantNumber {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int countInRange(int[] arr, int n, int s, int e) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                count++;
            }
        }
        return count;
    }
    public static int majorityElement(int[] arr, int s, int e) {
        if (s==e) {
            return arr[s];
        }
        int mid = s+(e-s)/2;
        int left = majorityElement(arr, s, mid);
        int right = majorityElement(arr, mid+1, e);
        if (left==right) {
            return left;
        }
        int leftCount = countInRange(arr, left, s, e);
        int rightCount = countInRange(arr, right, s, e);
        
        return leftCount>rightCount?left:right;
    }
    public static void main(String args[]) {
        int nums[] = {1,1,1,2,2,1,1,2};
        System.out.println(majorityElement(nums, 0, nums.length-1));
    }
}
