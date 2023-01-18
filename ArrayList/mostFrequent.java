package ArrayList;

import java.util.ArrayList;

public class mostFrequent {
    public static int doit(ArrayList<Integer> list, int tar) {
        int[] ans = new int[1000];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==tar) {
                ans[list.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int a = 0;

        for (int i = 0; i < 1000; i++) {
            if (ans[i]>max) {
                max = ans[i];
                a+=1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        System.out.println(doit(list, 1));
    }
}
