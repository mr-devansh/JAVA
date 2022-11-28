package bitManipulation;

public class getSetCler {
    public static void get(int a, int pos) {
        int z = 1<<pos;
        if ((a&z)==0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
    public static void set(int a, int pos) {
        System.out.println(a|(1<<pos));
    }
    public static void clear(int a, int pos) {
        System.out.println(a&(~(1<<pos)));
    }
    public static void update(int a, int pos, int bit) {
        if (bit==1) {
            set(a, pos);
        }else{
            clear(a, pos);
        }
    }
    public static void main(String[] args) {
        int a1 = 9;
        int pos1 = 3;
        get(a1, pos1);

        int a2 = 9;
        int pos2 = 1;
        set(a2, pos2);

        int a3 = 9;
        int pos3 = 3;
        clear(a3, pos3);

        int a4 = 9;
        int pos4 = 2;
        int bit = 1;
        update(a4, pos4, bit);
    }
}
