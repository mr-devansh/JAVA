package Recursion;

public class checkIfSorted {
    public static boolean func(int[] a, int z) {
        if (z==a.length-1) {
            return true;
        }
        if(a[z]>a[z+1]){
            return false;
        }
        return func(a, z+1);            
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int z = 0;
        System.out.println(func(a, z)); 
    }
}