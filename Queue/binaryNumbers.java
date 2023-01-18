package Queue;

import java.util.*;

public class binaryNumbers {
    public static int process(int z) {
        int s = 0;
        int pow = 0;
        while (z>0) {
            s += (z%2)*(Math.pow(10, pow));
            pow += 1;
            z /= 2;
        }
        return s;
    }
    public static Queue<Integer> doit(int n) {
        Queue<Integer> s = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            s.add(process(i));
        }
        return s;
    }
    public static void main(String[] args) {
        Queue<Integer> s = doit(5);
        while (!s.isEmpty()) {
            System.out.print(s.peek()+" ");
            s.remove();
        }
    }
}
