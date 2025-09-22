//implementation of stack using ArrayList
// import java.util.ArrayList;
// public class stack1{
//     static class stack{
//         static ArrayList<Integer> list = new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size() == 0;
//         }
//         //push
//         public static void push(int data){
//             list.add(data);
//         }
//         //pop
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
//     public static void main(String args[]){
//         stack s = new stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// implementation of stack using linkedlist
// public class stack1 {
//     static class Node {
//      int data;
//      Node next;
//       Node(int data) {
//       this.data = data;
//       this.next = null;
//        }
//     }
//     static class Stack {
//         static Node head = null;

//         // Check if stack is empty
//         public static boolean isEmpty() {
//             return head == null;
//         }

//         // Push operation
//         public static void push(int data) {
//             Node newNode = new Node(data);
//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }
//             newNode.next =head;
//             head = newNode;
//         }

//         // Pop operation
//         public static int pop() {
//             if (isEmpty()) {
//                 return -1; // Stack is empty
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         // Peek operation
//         public static int peek() {
//             if (isEmpty()) {
//                 return -1; // Stack is empty
//             }
//             return head.data;
//         }
//     }
//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// java collex=ction framework
// import java.util.*;
// public class stack1 {
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


//  push element at bottom of stack
// import java.util.*;
// public class stack1 {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if (s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         System.out.println(s);
//         pushAtBottom(s, 4);
//         while(s.isEmpty() == false){
//             System.out.println(s.peek());
//             s.pop();
//         }
//         System.out.println(s);
//     }
// }
       

// reverse  a string using stack
import java.util.*;

public class stack1 {
    // Method to reverse a string using Stack
    public static void reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        // Push all characters into stack
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        // Pop characters to build reversed string
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        System.out.println(result.toString());
    }

    // Main method
    public static void main(String args[]) {
        String str = "yash";
        reverseString(str);
    }
}
