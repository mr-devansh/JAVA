package Queue;

import java.util.*;

public class removeKelements {
    public static Stack<Integer> s =new Stack<>();
    public static void doit(Queue<Integer> q, int k) {
        int left = q.size()-k;
        while (k>0) {
            s.push(q.remove());
            k--;
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        while (left>0) {
            q.add(q.remove());
            left--;
        }
        // print
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        int k =5;
        doit(q,k);
    }
}
