public class palindrome {
    boolean func(int a){
        int z = 0;
        int copy = a;
        boolean ans = true;
        while (a>0) {
            int last = a%10;
            z = z*10+last;
            a = a/10;
        }
        if (z!=copy) {
            ans = false;
        } 
        return ans;
    }
    public static void main(String[] args) {
        palindrome obj = new palindrome();
        
        System.out.println(obj.func(1231));
    }
}
