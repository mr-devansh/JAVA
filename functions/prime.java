public class prime {
    boolean primeOr(int a){
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a%i==0) {
                isPrime =  false;  
                break;     
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        prime obj = new prime();
        System.out.println(obj.primeOr(5));
        
    }
}
