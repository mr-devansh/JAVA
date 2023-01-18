package LinkedList;
import java.util.LinkedList;
public class usingCollections {
    public static void main(String[] args) {
        // cannot store int, float, boolean, other than thst we use Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
