package Hashing;

import java.util.HashSet;

public class distinctElements {
    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> s = new HashSet<>();
        for (Integer n : num) {
            s.add(n);
        }
        System.out.println(s.size());
    }
}
