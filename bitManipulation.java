import java.util.Scanner;

public class bitManipulation {
    public static void main(String[] args) {
        // operations in bit manipulation: get, set, clear, update

        // 1. GET bit (and with the bitmask)
        int n = 5;
        int pos = 2;
        String bit = "";
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            bit = "zero";
        } else {
            bit = "one";
        }
        System.out.println("Bit at position " + pos + " for " + n + " is: " + bit);

        // 2. SET bit (or with bit mask)
        int n2 = 5;
        int pos2 = 1;
        int bitMask2 = 1 << pos2;
        n2 = ((bitMask2) | n2);
        System.out.println("Bit at position " + pos2 + " for " + n2 + " updated to: " + n2);

        // 3.CLEAR bit (and with not of bitmask)
        int n3 = 5;
        int n3_new = 5;
        int pos3 = 2;
        int bitMask3 = 1 << pos3;
        int notBitMask3 = ~bitMask3;
        n3 = notBitMask3 & n3;
        System.out.println("Bit at position " + pos3 + " cleared for " + n3_new + ", updated number: " + n3);

        // 4. UPDATE bit
        // for making 0 we use clear
        // for making 1 we use set method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n4 = sc.nextInt();
        System.out.print("Enter a position: ");
        int pos4 = sc.nextInt();
        System.out.print("Enter bit to update to(0,1): ");
        int op4 = sc.nextInt();
        int bitMask4 = 1 << pos4;
        if (op4 == 0) {
            int notBitMask4 = ~bitMask4;
            int n4_new = notBitMask4 & n4;
            System.out.println("number after updation: " + n4_new);
        } else if (op4 == 1) {
            int n4_new = bitMask4 | n4;
            System.out.println("number after updation: " + n4_new);
        }
    }
}
