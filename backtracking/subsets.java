package backtracking;

public class subsets {
    public static void doit(String str, String ans, int i) {
        if (i==str.length()) {
            System.out.println(ans);
            return;
        }
        doit(str, ans+str.charAt(i), i+1);
        doit(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        doit(str, "", 0);
    }
}
