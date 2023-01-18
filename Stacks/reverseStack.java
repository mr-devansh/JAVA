package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void doit(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int val = s.pop();
        doit(s);
        reverse(s, val);
        
    }
    public static void reverse(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        reverse(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        doit(s);
        System.out.println(s);
    }
}
