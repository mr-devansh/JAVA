package Conditional;

public class leapYear {
    public static void main(String[] args) {
        int year = 2028;
        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0) {
                    System.out.println("leap");
                } else {
                    System.out.println("not");
                }
            } else {
                System.out.println("leap");
            }
        } else {
            System.out.println("not");
        }
    }
}
