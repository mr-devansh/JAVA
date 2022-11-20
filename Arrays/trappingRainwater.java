// package Arrays;
// we use auxilary arrays to solve it also knwon as helper arrays
public class trappingRainwater {
    public static int rainwater(int arr[]) {
        int [] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        int [] rightMax = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >=0 ; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
        int current = 0;
            current = Math.min(leftMax[i], rightMax[i])-arr[i];
            total+=current;
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5}; 
        System.out.println(rainwater(arr));
    }
}
