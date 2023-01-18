package Stacks;
import java.util.Stack;
// Sample Input 2: 3[b2[v]] Sample Output 2: bvvbvvbvv
public class decodeString {
    public static String doit(String str) {
        Stack<String> s = new Stack<>();
        Stack<Character> ch = new Stack<>();
        String temp="", result="";
        for (int i = 0; i < str.length()-1; i++) {
            int count =0;
            if (str.charAt(i)>='1' && str.charAt(i)<='9') {
                
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "3[b2[v]]";
        System.out.println(doit(str));
    }
}
