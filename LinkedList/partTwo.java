package LinkedList;

public class partTwo {
        public static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data = data;
                this.next=null;
            }
        }
        public static Node head;
        public static Node tail;
        public static int size;

        public static void print(){
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

        // using slow fast approach
        public static boolean isCycle() {
            Node slow = head;
            Node fast = head;
            while (fast!=null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow==fast) {
                    return true;
                }
            }
            return false;
        }
        

        public static void removeCycle() {
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while (fast.next!=null && fast!=null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow==fast) {
                    cycle = true;
                    break;
                }
            }
            if (cycle==false) {
                return;
            }

            slow = head;
            Node prev = null;
            while (slow!=fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            prev.next = null;
        }


        public static void main(String[] args) {
            head = new Node(1);
            Node temp = new Node(2);
            head.next = temp;
            head.next.next = new Node(3);
            head.next.next.next = temp;
            // print();
            System.out.println(isCycle());

            removeCycle();
            System.out.println(isCycle());
            // print();
        }
}
