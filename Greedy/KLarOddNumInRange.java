package Greedy;

public class KLarOddNumInRange {
    public static void main(String[] args) {
        int L = -10, R = 10, K = 8;
        int ans = 0;
        for (int i = R; i >= L; i--) {
            if (i%2!=0 && K==1) {
                ans = i;
                break;
            }
            else if(i%2!=0){
                K--;
            }
        }
        System.out.println(ans);
    }
}
