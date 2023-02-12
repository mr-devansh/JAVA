package Hashing;

import java.util.HashSet;

public class unionNIntersection {
    public static void main(String[] args) {
        int a1[] = {7,3,9};
        int a2[] = {6,3,9,2,9,4};

        HashSet<Integer> h = new HashSet<>();

        for (int i : a1) {
            h.add(i);
        }
        for (int j : a2) {
            h.add(j);
        }
        System.out.println(h.size());

        HashSet<Integer> h2 = new HashSet<>();

        for (Integer i : a1) {
            h2.add(i);
        }
        int count=0;
        for (Integer j : a2) {
            if (h2.contains(j)) {
                count++;
                h2.remove(j);
            }
        }
        System.out.println(count);
    }
}
