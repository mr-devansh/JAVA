package Greedy;

public class MaxBalStrPart {
    public static void main(String[] args) {
        String s = "LLRRRLLRRL";
        int count = 0;
        int flag = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='R') {
                flag++;
            }else if(s.charAt(i)=='L'){
                flag--;
            }
            if (flag==0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
