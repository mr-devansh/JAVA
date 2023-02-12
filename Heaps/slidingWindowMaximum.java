package Heaps;

import java.util.PriorityQueue;

public class slidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int idx;
        int val;
        public Pair(int val, int idx){
            this.idx = idx;
            this.val = val;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.val-this.val; 
            //descending order
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int len = arr.length;
        int k = 3;
        int res[] = new int[len-k+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }
        res[0] = pq.peek().val;
        for (int i = k; i < len; i++) {
            while (pq.size()>0 && pq.peek().idx<=(i-k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
