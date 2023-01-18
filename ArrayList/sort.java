package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);

        Collections.sort(list);
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(1);
        list2.add(2);
        list2.add(3);

        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
    }
}
