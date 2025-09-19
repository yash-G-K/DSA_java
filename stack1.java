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
public class stack1 {
    static class Node {
     int data;
     Node next;
      Node(int data) {
      this.data = data;
      this.next = null;
       }
    }
    static class Stack {
        static Node head = null;

        // Check if stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // Push operation
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next =head;
            head = newNode;
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) {
                return -1; // Stack is empty
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) {
                return -1; // Stack is empty
            }
            return head.data;
        }
    }
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
