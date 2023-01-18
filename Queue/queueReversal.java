package Queue;

import java.util.*;

public class queueReversal {
    public static void doit(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void print(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        doit(q1);
        print(q1);
    }
}
