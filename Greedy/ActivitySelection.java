package Greedy;

import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        ArrayList<Integer> a = new ArrayList<>();

        int maxAct = 1;
        int lastEnd = end[0];
        a.add(0);

        for (int i = 1; i < end.length; i++) {
            if (start[i]>=lastEnd) {
                maxAct++;
                a.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println(a);
    }
}
