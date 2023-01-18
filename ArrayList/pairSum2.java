package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class pairSum2 {
    public static boolean doit(ArrayList<Integer> list, int target) {
        int max = -1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)>list.get(i+1)) {
                max = i;
                break;
            }
        }
        int l = max+1;
        int r = max;
        while (l!=r) {
            int sum = list.get(r)+list.get(l);
            int size = list.size();
            if (sum==target) {
                return true;
            }
            if (sum<target) {
                l=(l+1)%size;
            }
            else{
                r= (size+r-1)%size;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

            list.add(4);
            list.add(5);
            list.add(6);
            list.add(1);
            list.add(2);
            list.add(3);

            System.out.println(doit(list, 5));  
    }
}
