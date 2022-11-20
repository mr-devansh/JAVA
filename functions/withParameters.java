public class withParameters {
    void fun1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A: "+a+"\nB: "+b);
    }
    public static void main(String[] args) {
        withParameters obj = new withParameters();
        obj.fun1(1,2);
    }
}
