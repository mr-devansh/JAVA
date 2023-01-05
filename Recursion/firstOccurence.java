package Recursion;

public class firstOccurence {
    public static int func(int[] a,int z, int key) {
        if (key==a[z]) {
            return z;
        }
        if (z==a.length-1) {
            return -1;
        }
        return func(a, z+1, key);
    }
    public static void main(String[] args) {
        int a[] = {1,2,5,6,7,4,5,6,7,8,9};
        int key = 4;
        int z = 0;
        System.out.println(func(a, z, key));
    }
}
