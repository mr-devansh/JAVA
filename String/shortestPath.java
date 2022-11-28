package String;

public class shortestPath {
    public static void check(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char z = str.charAt(i);
            if (z=='W') {
                x--;
            }
            else if (z=='N') {
                y++;
            }
            else if (z=='E') {
                x++;
            }
            else{
                y--;
            }
        }
        System.out.println("Final coordinates are: ("+x+", "+y+"), and displacement: "+(float)(Math.sqrt((x*x)+(y*y))));
    }
    public static void main(String[] args) {
        String str = "WNWN";
        check(str);
    }
}
