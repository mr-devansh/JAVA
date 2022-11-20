public class decTobin {
    void bin(int dec){
        int s = 0;
        int pow= 0;
        while (dec>0) {
            s += (dec%2)*(int)(Math.pow(10, pow));
            pow += 1;
            dec = dec/2;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        decTobin obj = new decTobin();
        obj.bin(10);
    }
}
