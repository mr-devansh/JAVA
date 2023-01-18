package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);

        int temp = list.get(1);
        list.set(1, list.get(2));
        list.set(2, temp);
        System.out.println(list);

    }
}
