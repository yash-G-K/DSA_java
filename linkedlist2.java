public class linkedlist2 {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Detect cycle using Floyd’s Cycle Detection
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;   // moves 1 step
        Node fast = head;   // moves 2 steps

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, cycle exists
            if (slow == fast) {
                return true;
            }
        }
        return false; // No cycle
    }

    // Main method
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Uncomment below line to create a cycle (4 -> 2)
        head.next.next.next.next = head.next;

        if (hasCycle(head)) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle in the linked list.");
        }

    }
}
