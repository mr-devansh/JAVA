package Recursion;

public class words {
    static String[] wordsArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};


    public static void doit(int n) {
        if (n==0) {
            return;
        }
        int lastDigit = n%10;
        doit(n/10);
        System.out.print(wordsArray[lastDigit]+" ");
    }
    public static void main(String[] args) {
        doit(2019);
    }
}
