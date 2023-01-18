package LinkedList;
public class swapNodes {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty linked list!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void swap(int a, int b){
        Node tempX = head;
        Node prevX = null;
        while (tempX!=null && tempX.data!=a) {
            prevX = tempX;
            tempX = tempX.next;
        }
        Node tempY = head;
        Node prevY = null;
        while (tempY!=null && tempY.data!=b) {
            prevY = tempY;
            tempY = tempY.next;
        }
        if (prevX!=null) {
            prevX.next = tempY;
        }else{
            head = tempY;
        }
        if (prevY!=null) {
            prevY.next = tempX;
        }else{
            head = tempX;
        }
        Node temp = tempX.next;
        tempX.next = tempY.next;
        tempY.next = temp;
    }

    public static void main(String[] args) {
        swapNodes ll = new swapNodes();
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);

        ll.print();
        ll.swap(2,4);
        ll.print();
    }
}
