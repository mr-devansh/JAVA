package Heaps;

import java.util.PriorityQueue;

public class MinTimeToFillNSlots {
    public static void minTime(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (pq.size()!=n) {
            for (int i = 0; i < arr.length; i++) {
                pq.add(arr[i]);
            }
            if (pq.contains(n)) {
                pq.add(n-1);
            }
            if (pq.contains(1)) {
                pq.add(2);
            }
            
        }
    }
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {2,6};
        int k = arr.length;
        minTime(arr,n,k);
    }
}
