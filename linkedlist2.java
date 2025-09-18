// // Java program to detect and remove cycle in a linked list
// public class linkedlist2 {
//     // Node class
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Detect cycle using Floyd’s Cycle Detection
//     public static boolean hasCycle(Node head) {
//         if (head == null || head.next == null) {
//             return false;
//         }

//         Node slow = head;   // moves 1 step
//         Node fast = head;   // moves 2 steps

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             // If slow and fast meet, cycle exists
//             if (slow == fast) {
//                 return true;
//             }
//         }
//         return false; // No cycle
//     }

//     // Removing cycle from linked list
//     public static void removeCycle(Node head) {
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;

//         // Detect cycle
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {
//                 cycle = true;
//                 break;
//             }
//         }

//         if (!cycle) return; // No cycle found

//         // Move slow to head and find meeting point
//         slow = head;
//         Node prev = null;
//         while (slow != fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         // Break the cycle
//         prev.next = null;
//     }

//     // Main method
//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);

//         // Create a cycle (4 -> 2)
//         head.next.next.next.next = head.next;

//         // Detect cycle before removal
//         if (hasCycle(head)) {
//             System.out.println("Cycle detected in the linked list.");
//         } else {
//             System.out.println("No cycle in the linked list.");
//         }

//         // Remove cycle
//         removeCycle(head);

//         // Detect cycle after removal
//         if (hasCycle(head)) {
//             System.out.println("Cycle still exists.");
//         } else {
//             System.out.println("Cycle removed successfully.");
//         }
//     }
// }


//ll collection frMEWORK
import java.util.LinkedList;
public class linkedlist2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
    }

}