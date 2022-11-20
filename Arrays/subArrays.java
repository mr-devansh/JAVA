// package Arrays;

public class subArrays {
    public static void sub(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 < j+1; j2++) {
                    sum+=arr[j2];
                    System.out.print(arr[j2]+" ");
                }
                System.out.println("sum: "+sum);
                if (sum>max) {
                    max = sum;
                }if(sum<min){
                    min = sum;
                }
            }
        System.out.println("min: "+min+", max: "+max);
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,-4,6,8,-10};
        sub(arr);
    }
}
