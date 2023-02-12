package Hashing;

import java.util.HashMap;

import backtracking.keypadCombination;

public class subarraySumK {
    public static void main(String[] args) {
        int k = -10;
        int arr[] = {10,2,-2,-20,10};

        int sum = 0;
        int len = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (h.containsKey(sum-k)) {
                len+=h.get(sum-k);
            }    
            else{
                h.put(sum, h.getOrDefault(sum, 0)+1);
            }
        }
        System.out.println(len);
    }
}
