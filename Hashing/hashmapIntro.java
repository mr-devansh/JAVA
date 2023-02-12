package Hashing;
import java.util.*;
public class hashmapIntro {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm = new HashMap<>();

        //insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);

        //get
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Arabia"));

        //contains
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Arabia"));

        //remove
        hm.remove("China");
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm);
    }
}
// hashing implemented using map and set 
// maps are of several types like hashmap, linked hashmap and treemap
// sets are of several types like hashset, linked hashset and treeset