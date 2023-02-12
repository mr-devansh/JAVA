package Hashing;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int arr[]= {2,7,11,15,3,2,4};
        int k = 6;
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = k-arr[i];
            if (h.containsKey(diff)) {
                System.out.println(i+" "+h.get(diff));
            }
                h.put(arr[i], i);
        }
    }
}
