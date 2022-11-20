public class binToDec {
    
    void bin(int binNum){
        int decimal  = 0;
        int power = 0;
        while (binNum>0) {
            int lastDigit = binNum%10;
            decimal += lastDigit*(int)(Math.pow(2, power)); 
            power+=1;
            binNum = binNum/10;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        binToDec obj = new binToDec();
        obj.bin(1010);
        
    }
}
