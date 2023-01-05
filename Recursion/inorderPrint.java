package Recursion;
public class inorderPrint {
    public static void func(int a) {
        if (a==1) {
            System.out.println(a);
            return;
        }
        func(a-1);
        System.out.println(a);
    }
    public static void main(String[] args) {
        func(6);
    }
}
