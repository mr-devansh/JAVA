package Recursion;
public class lastOccurence {
    public static int func(int[] a,int z, int key) {
        if (key==a[z]) {
            return z;
        }
        if (z==0) {
            return -1;
        }
        return func(a, z-1, key);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,4,4};
        int key = 4;
        int z = a.length-1;
        System.out.println(func(a, z, key));
    }
}
