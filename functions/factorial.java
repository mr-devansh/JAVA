public class factorial {
    int facto(int a){
        int fact = 1;
        for (int i = 2; i < a+1; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        factorial obj = new factorial();
        System.out.println(obj.facto(5));
    }
}
