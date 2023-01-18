package LinkedList;
// import java.util.LinkedList;
public class mergeSortInLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static Node getMid() {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

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

    public void print(){
        if (head == null) {
            System.out.println("Empty linked list!");
            return;
        }
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp = temp.next;
    }
    System.out.println();
   }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid();
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergesort(head);
        Node newRight = mergesort(rightHead);
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        mergeSortInLL ll = new mergeSortInLL();
        ll.addfirst(1);
        ll.addfirst(5);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        // 1. find middle value
        // 2. divide LL in two parts L and R
        // mid.next= null
        // 3. merge both of them
        ll.print();
        head = ll.mergesort(head);
        ll.print();
    }
}
