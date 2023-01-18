package ArrayList;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class mostWater {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int i = 0;
        int j = list.size()-1;
        int maxVol = Integer.MIN_VALUE;
        while (i<j) {
            int width = j-1;
            int height = Math.min(list.get(i), list.get(j));
            maxVol = Math.max(width*height, maxVol);
            if (i<j) {
                i++;
            }else{
                j++;
            }
        }
        System.out.println(maxVol);
    }
}
