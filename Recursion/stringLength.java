package Recursion;
public class stringLength {
    public static int doit(String str) {
        if (str.length()==0) {
            return 0;
        }
        return doit(str.substring(1))+1;
    }
    public static void main(String[] args) {
        System.out.println(doit("devansh")); 
    }
}
