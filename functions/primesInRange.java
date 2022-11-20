public class primesInRange {
    boolean isPrime(int a){
        boolean b = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i==0) {
                b = false;
                break;
            }
        }
        return b;
    }
    void fund(int a, int b){
        for (int i = a; i < b+1; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
        
    public static void main(String[] args) {
            primesInRange obj = new primesInRange();
            obj.fund(2,20);
        
    }
}
