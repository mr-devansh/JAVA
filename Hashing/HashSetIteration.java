package Hashing;

import java.util.HashSet;
public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // 1. Iterator
        // java.util.Iterator<String> it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // 2. Advanced for loop
        // for (String city : cities) {
        //      System.out.println(city);
        // }
    }
}
