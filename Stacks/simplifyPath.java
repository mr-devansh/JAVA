package Stacks;

import java.util.Stack;

public class simplifyPath {
    public static String doit(String str) {
        Stack<String> s = new Stack<>();
        String res = "";
        res += "/";
        for (int i = 0; i < str.length() - 1; i++) {
            String dir = "";
            while (i < str.length() && str.charAt(i) == '/') {
                i++;
            }
            while (i < str.length() && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }
            if (dir.equals("..") == true) {
                if (!s.empty())
                    s.pop();
            }
            else if (dir.equals(".") == true)
                continue;
            else if (dir.length() != 0)
                s.push(dir);
        }
        Stack<String> st1 = new Stack<String>();
        while (!s.empty()) {
            st1.push(s.pop());
        }
        while (!st1.empty()) {
            if (st1.size() != 1)
                res += (st1.pop() + "/");
            else
                res += st1.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "/ap/";
        System.out.println(doit(str)); 
    }
}
