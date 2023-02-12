package Hashing;
import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 10);
        lhm.put("US", 15);
        lhm.put("China", 20);
        System.out.println(lhm);
    }
}
