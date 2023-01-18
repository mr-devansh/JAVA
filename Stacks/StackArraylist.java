package Stacks;

import java.util.ArrayList;

public class StackArraylist {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop() {
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek() {
            return list.get(list.size()-1);
        }
        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            System.out.println(list);
            System.out.println(s.peek());
            System.out.println(s.pop());
            System.out.println(list);
        }
    }
}
