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

    // Main method
    public static void main(String args[]) {
        linkedlist ll = new linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println("Head: " + ll.head.data);
        System.out.println("Tail: " + ll.tail.data);
    }
}
