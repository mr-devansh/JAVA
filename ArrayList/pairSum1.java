package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class pairSum1 {
    public static boolean doit(ArrayList<Integer> list, int target) {
        int i = 0;
        int j = list.size()-1;
        while (i<j) {
            int sum = list.get(i)+list.get(j);
            if (sum == target) {
                return true;
            }
            else if (sum<target) {
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);

            System.out.println(doit(list, 50)); 
    }
}
