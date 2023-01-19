package Greedy;

import java.util.*;

public class chocola {
    public static void main(String[] args) {
        Integer[] hor = { 4, 1, 2 };
        Integer[] ver = { 2, 1, 3, 1, 4 };
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        Arrays.sort(hor, Collections.reverseOrder());
        Arrays.sort(ver, Collections.reverseOrder());

        while (h < hor.length && v < ver.length) {
            if (ver[v] <= hor[h]) { // horizontal cut
                cost += vp * hor[h];
                hp++;
                h++;
            } else { // vertical cut
                cost += hp * ver[v];
                vp++;
                v++;
            }
        }
        while (h < hor.length) {
            cost += vp * hor[h];
            hp++;
            h++;
        }
        while (v < ver.length) {
            cost += hp * ver[v];
            vp++;
            v++;
        }
        System.out.println("cost: "+cost);
    }
}
