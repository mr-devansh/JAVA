package LinkedList;

public class definition {
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


    // 1. add()
    // 2. remove()
    // 3. print()
    // 4. searchIterative() 
    // 5. size
    // 6. reverse()
    // 7. palindrome()

    //1A    add new node at first position
    //steps: 
    //      create new node 
    //      new node next = head 
    //      head = new node
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return; 
        }
        newNode.next = head;
        head = newNode;
    }

    // 1B    add new node at last position
    // steps:
    //       create new node
    //       tail.next = newNode
    //       tail = newNode 
    public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if (head == null) {
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
   }

//    1C   add in middle of linked list
//    steps:
//         create new node
//         point old node next to newnode 
//         point newnode next to other element

    public void addMiddle(int data, int index){
        if (index==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

//    2A   remove first element of linked list
//    steps:
//         make head.next as head

    public int removeFirst(){
        if (size==0) {
            System.out.println("Empty Linked List!");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
        
// 2B  remove last element of linked list
// steps: 
 //     reach the previous node of the tail node
//     point previous node next to null
//     mark tail value to previous node

    public int removelast(){
        if (size==0) {
            System.out.println("Empty Linked List!"); 
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

// 2C  remove Nth element from the last
// steps:
// calculate size - n + 1
// removeMiddle operation

    public void removeMiddleFromLast(int z){
        int c = 0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            c++;
        }
        if (z == c) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = c-z;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }


//    3A   print linked LinkedList
//    steps:
//         temp node starts from head
//         print temp node
//         temp node= temp node.next
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

// 4A   searchIterative in linked list using iterative process
// steps:
        // temp node = head
        // while temp not null
        // compare temp.data with key

    public int searchIterative(int target){
        int i = 0;
        Node temp = head;
        while (temp!=null) {
            if (temp.data==target) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
   }

// 4B  search in recursive manner in the linked list
// steps:
    public int helper(Node head, int key){
        if (head==null) {
            return -1;
        }
        if (head.data==key) {
            return 0;
        }
        int i = helper(head.next, key);
        if (i==-1) {
            return -1;
        }
        return i+1;
    }
    public int SearchRec(int key){
        return helper(head, key);
    }


//    5A   print size of linked list
//    steps:
//         initiate a temp node from head
//         count each node until next node null
    public void size(){
        Node temp = head;
        int i = 0;
        while (temp!=null) {
            i++;
            temp = temp.next;
        }
        System.out.println("Size of Linked List: "+i);
    }

// 6A  reverse a linked list using iterative approach
// 4 steps process:
    // next will be curr.next
    // curr.next will be prev
    // prev will be shifted to curr
    // and curr shited to next

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
 
// 7A  palindrom Linked List or not
// steps:  
    // calculate mid value using slow fast approach
    // reverse the secondhalf of arrayList
    // compare both the halves if same hence palindrome


public boolean palindrome(){
    if (head == null || head.next==null) {
        return true;
    }
    // step 1 find mid
    Node s = head;
    Node f = head;
    while (f !=null && f.next != null) {
        s = s.next;
        f = f.next.next;
    }
    // step 2 reverse second half
    Node prev = null;
    Node curr = s;
    Node next;
    while (curr!=null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node left = head;
    Node right = prev;
    while (right!=null) {
        if (left.data!=right.data) {
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
}

    public static void main(String[] args) {
        // definition ll = new definition();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addMiddle(100, 3);

        // ll.print();
        // System.out.println("Size of Linked List: "+size);
        // // O(1)
        // // ll.size(); 
        // // O(n)

        // System.out.println("Removed: "+ll.removeFirst()); 
        // System.out.println("Size of Linked List: "+size);
        // ll.print();

        // System.out.println("Removed: "+ll.removelast());
        // System.out.println("Size of Linked List: "+size);
        // ll.print();

        // System.out.println("Element search index: "+ll.searchIterative(3));
        // System.out.println("Element search index: "+ll.SearchRec(100));

        // ll.reverse();
        // ll.print();

        // ll.removeMiddleFromLast(1);
        // ll.print();

        definition ll2 = new definition();
        ll2.addFirst(1);
        ll2.addFirst(2);
        ll2.addFirst(2);
        ll2.addFirst(1);
        ll2.print();
        System.out.println(ll2.palindrome());
    }
}
 