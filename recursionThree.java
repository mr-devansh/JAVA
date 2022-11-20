import java.security.Permission;
import java.util.Currency;
// Q1. print all permutations of a string 
public class recursionThree {
    public static void Permutation(String str, String perm) {
        if (str.length()==0) {
            System.out.println(perm);
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            System.out.println("i: "+i+" currChar: "+currChar+" newString: "+newString);
            Permutation(newString, perm+currChar);
            
        }
    }
    public static void main(String[] args) {
        Permutation("abc", "");
    }
}
