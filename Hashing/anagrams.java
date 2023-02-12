package Hashing;

import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String a ="race";
        String b ="care";
        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i)+1,0));
        }for (int i = 0; i < b.length(); i++) {
            map.put(b.charAt(i), map.getOrDefault(a.charAt(i)-1,0));
        }
        Set<Character> keys = map.keySet(); 
        if (map.isEmpty()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
