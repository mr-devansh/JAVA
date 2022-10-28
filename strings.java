public class strings {
    public static void main(String[] args) {
        String str = "devansh singh";
        String str2 = "jatt boi";
        System.out.println("length of string: "+str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        if(str.compareTo(str2)==0){
            System.out.println("Equal strings");
        }else{
            System.out.println("String not equal");
        }
        System.out.println(str.substring(0, str.length()-1));
    }
}
  