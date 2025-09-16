
// Linked List implementation with basic operations
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
        Node newNode = new Node(data);

        if (head == null) { // if list is empty
            head = newNode;
            tail = newNode;
            return;
        }

        // Insert new node before current head
        newNode.next = head;
        head = newNode;
    }

    // Add element at the end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) { // if list is empty
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add element in the middle (at index idx)
    public void addMiddle(int idx, int data) {
        Node newNode = new Node(data);

        if (head == null) { // if list is empty
            head = newNode;
            tail = newNode;
            return;
        }

        if (idx == 0) { // insert at head
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < idx - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }

        // Insert new node
        newNode.next = temp.next;
        temp.next = newNode;

        // Update tail if inserted at last
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Remove first element
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        // If list becomes empty
        if (head == null) {
            tail = null;
        }
    }

    // Remove last element
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (head.next == null) { // only one element
            head = tail = null;
            return;
        }

        // Traverse to 2nd last node
        Node prev = head;
        for (int i = 0; i < size() - 2; i++) {
            prev = prev.next;
        }

        prev.next = null;
        tail = prev;
    }

    // Function to return size of linked list
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    // Search for an element and return its index, -1 if not found
    public int search(int key) {
        Node temp =head;
        int index = 0;
        while(temp !=null){
            if(temp.data == key){//key found
                return index;
            }
            temp = temp.next;
            index++;
        }
        //key not found
        return -1;
    }
    // recursive searchj
    private int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx +1;
    }

    public int recsearch(int key){
        return helper(this.head,key);
    }

    // Main method
    public static void main(String args[]) {
        linkedlist ll = new linkedlist();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        System.out.println("Initial List:");
        ll.printList();

        ll.addMiddle(2, 5);
        System.out.println("After inserting 5 at index 2:");
        ll.printList();

        System.out.println("Head: " + ll.head.data);
        System.out.println("Tail: " + ll.tail.data);

        ll.removeFirst();
        System.out.println("After removing first:");
        ll.printList();

        ll.removeLast();
        System.out.println("After removing last:");
        ll.printList();

        System.out.println("Size of list: " + ll.size());

        // System.out.println("Index of element 5: " + ll.search(5));
        // System.out.println("Index of element 10: " + ll.search(10));

        System.out.println("Index of element 5 (recursive): " + ll.recsearch(5));
        System.out.println("Index of element 10 (recursive): " + ll.recsearch(10));

    }
}



