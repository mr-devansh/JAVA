package ArrayList;

import java.util.ArrayList;

public class TwoDarray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Twolist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        Twolist.add(list1);
        Twolist.add(list2);
        System.out.println(Twolist);

        for (int i = 0; i < Twolist.size(); i++) {
            ArrayList<Integer> curr = Twolist.get(i);
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
}
