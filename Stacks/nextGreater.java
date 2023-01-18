package Stacks;

import java.util.Stack;

public class nextGreater {
    public static void next(int values[], int nextGreater[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = values.length-1; i >=0; i--) {
            while (!s.isEmpty() && values[s.peek()]<=values[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = values[s.peek()] ;
            }
            s.push(i);
        }
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int values[] = {6,8,9,1,3};
        print(values);
        int nextGreater[] = new int[values.length];
        next(values, nextGreater);
        print(nextGreater);
    }
}

     
