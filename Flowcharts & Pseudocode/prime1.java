/**
 * prime
 */
public class prime1 {

    public static void main(String[] args) {
        int n = 7;
        int count = 2;
        String str = "prime";
        while (count<n) {
            if (n%count==0) {
                str = "Not prime";
                break;
            }
            count++;
        }
        System.out.println("Answer: "+str);
    }
}