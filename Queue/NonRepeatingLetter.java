package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class NonRepeatingLetter {
    public static String doit(String str, int[] arr) {
        Queue<Character> q = new LinkedList<>();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            arr[ch-'a']++;
            while (!q.isEmpty()&&arr[q.peek()-'a']>1) {
                q.remove();
                
            }
            if (q.isEmpty()) {
                ans+="-1 ";  
            } else {
                ans+=q.peek()+" ";
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str =  "aabccxb";
        int[] arr = new int[26];
        System.out.println(doit(str, arr)); 
    }
}
