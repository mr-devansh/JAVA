package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class interleaveQueue {
    public static void doit(Queue<Integer> q1) {
        Queue<Integer> q2 = new LinkedList<>();
        int count = 0;
        int size = q1.size();
        for (int i = 0; i < size/2; i++) {
            q2.add(q1.remove());
            
        }
        while (count<size) {
            if (count%2!=0) {
                q1.add(q1.remove());
                
            }
            else{
                q1.add(q2.remove());
                
            }
            count++;
        }
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        doit(q1);
    }
}
