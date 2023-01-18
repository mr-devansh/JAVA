package ArrayList;

import java.util.ArrayList;

import bitManipulation.addOne;

public class introduction {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list);
    System.out.println("Element at index 0 is "+list.get(0));

    list.remove(0);
    System.out.println(list);

    list.set(0, 100);
    System.out.println(list);
 
    System.out.println(list.contains(3));

    System.out.println(list.size());

    
    }
}
// operations are:
// add O(1)
// get O(1)
// remove O(n)
// set O(n)
// contains O(n)
// size O(n)