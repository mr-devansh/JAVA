package String;

public class compare {
    public static void main(String[] args) {
        String str = "dev";
        String str2 = "dev";
        String str3 = new String("dev");
        if (str==str2) {
            System.out.println("same");
        } else {
            System.out.println("not same"); 
        }
        if (str==str3) {
            System.out.println("same");
        } else {
            System.out.println("not same"); 
        }
        if (str.equals(str3)) {
            System.out.println("same");
        } else {
            System.out.println("not same"); 
        }
    }
}
