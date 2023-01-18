package Stacks;

import java.util.Stack;

public class reverseString {
    public static String reverseMe(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        idx = 0;
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        str = result.toString();
        return str;
    }
    public static void main(String[] args) {
        System.out.println(reverseMe("dev"));
    }
}
