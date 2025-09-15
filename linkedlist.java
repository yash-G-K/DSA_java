// Linked List implementation and new node creation and addition of node
public class linkedlist {
    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail of the LinkedList
    Node head;
    Node tail;

    // Add element at the beginning
    public void addFirst(int data) {
        // 1. Create new node
        Node newNode = new Node(data);

        // 2. If list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // 3. New node next = head
        newNode.next = head;

        // 4. Head = new node
        head = newNode;
    }
    //adding at last
    public void addlast(int data){
        // node creation
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next = head;
        tail = newnode;

    }

// public static void main(String args[]) {
// LinkedList ll = new LinkedList(); //direct creation of object
// ll.head= new Node(1);
// ll.head.next = new Node(2);


    // Main method
    public static void main(String args[]) {
        linkedlist ll = new linkedlist();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.addFirst(6);
        // ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(9);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);

        System.out.println("Head: " + ll.head.data);
        System.out.println("Tail: " + ll.tail.data);
    }
}
