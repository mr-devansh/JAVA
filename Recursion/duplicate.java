package Recursion;

public class duplicate {
    public static void remove(String str, int i, StringBuilder newstr, boolean map[]) {
        if (i == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(i);
        if (map[currChar-'a']==true) {
            remove(str, i+1, newstr, map);
        }else{
            map[currChar-'a']=true;
            remove(str, i+1, newstr.append(currChar), map);
        }
    }   
    public static void main(String[] args) {
        remove("ddeevanshhh", 0, new StringBuilder(""), new boolean[26]);
    }
}
