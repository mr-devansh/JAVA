package Hashing;
import java.util.*;
public class majorityElement {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[]= {1,3,2,5,1,3,1,5,1};
        for (int i = 0; i < arr.length; i++) {
            // if (hm.containsKey(arr[i])) {
            //     hm.put(arr[i], hm.get(arr[i])+1);
            // }
            // else{
            //     hm.put(arr[i], 1);
            // }

            map.put(arr[i], map.getOrDefault(arr[i],0));
        }
        Set<Integer> keys = map.keySet(); 
        for (Integer key : keys) {
            if (map.get(key)>arr.length/3) {
                System.out.println(key);
            }
        }
    }
}
