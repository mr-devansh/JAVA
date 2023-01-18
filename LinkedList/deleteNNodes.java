package LinkedList;

public class deleteNNodes {
    
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

    public void skipNremove(int m, int n){
        Node curr = head;
        Node t;
        int i;
        while (curr!=null) {
            for (i = 1; i < m && curr!=null; i++) {
                curr = curr.next;
            }
            if (curr==null) {
                return;
            }
            t = curr.next;
            for (i = 1; i <= n && t!=null; i++) {
                t = t.next;
            }
            curr.next = t;
            curr = t;
        }
    }

    public static void main(String[] args) {
        deleteNNodes ll = new deleteNNodes();
        ll.addfirst(8);
        ll.addfirst(7);
        ll.addfirst(6);
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);

        ll.print();
        ll.skipNremove(2,3);
        ll.print();
    }
}


