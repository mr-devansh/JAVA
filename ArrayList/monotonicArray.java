package ArrayList;

import java.util.ArrayList;

public class monotonicArray {
    public static boolean doit(ArrayList<Integer> list) {
        boolean i = true;
        boolean d = true;
        for (int j = 0; j < list.size()-1; j++) {
            if (list.get(j)>list.get(j+1)) {
                i = false;
            }
            if (list.get(j)<list.get(j+1)) {
                d = false;
            }
        }
        return i||d;
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(doit(list));
    }
}
