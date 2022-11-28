package String;

import java.util.Scanner;

public class countLowercaseVowels {
    public static void count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')&&(str.charAt(i) >= 'a' && str.charAt(i)<='z')) {
                count++;
            }
        }
        System.out.println("Total number of lowercase vowels in the string is: "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        count(str);
    }
}
