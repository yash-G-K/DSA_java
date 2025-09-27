// public class queue {
//   static class Queue{
//     static int arr[];
//     static int size;
//     static int rear;

//     Queue(int n){
//         arr= new int[n];
//         size = n;
//         rear =-1;
//     }
//      public static boolean isempty(){
//         return rear ==-1;
//      }
//      //add
//      public static void add(int data){
//         if(rear == size-1){
//             System.out.println("Queue is full");
//             return;
//         }
//      rear = rear+1;
//      arr[rear] = data;
//     }

//     // remove
//     public static int remove(){
//          if(isempty()){
//              System.out.println("empty queue");
//              return -1;
//         }
//         int front =arr[0];
//         for(int i=0; i<rear ; i++){
//         arr[i] = arr[i+1];
//     }
//     return front;
//   }
//   //peek
//   public static int peek() {
//     if(isempty()) {
//     System.out.println("empty queue");
//     return -1;
//     }
//     return arr[0];
// }
// }
// public static void main(string args[]){
//     Queue q = new Queue(5);
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     while(!q.isempty()){
//         System.out.println(q.peek());
//         q.remove();
//     }
// }
// }


//circulaar queue
// public class queue {
//     static class CircularQueue {
//         static int arr[];
//         static int size;
//         static int front;
//         static int rear;

//         CircularQueue(int n) {
//             arr = new int[n];
//             size = n;
//             front = -1;
//             rear = -1;
//         }

//         public static boolean isEmpty() {
//             return front == -1 && rear == -1;
//         }

//         public static boolean isFull() {
//             return (rear + 1) % size == front;
//         }

//         // add
//         public static void add(int data) {
//             if (isFull()) {
//                 System.out.println("Queue is full");
//                 return;
//             }
//             //adding  1st element
//             if (front == -1) {
//                 front = 0;
//             }
//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         // remove
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int result = arr[front];
//             // last element
//             if (front == rear) {
//                 front = rear = -1;
//             } else {
//                 front = (front + 1) % size;
//             }
//             return result;
//         }

//         // peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }
//     public static void main(String args[]) {
//         CircularQueue q = new CircularQueue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// Queue using linked list
// public class Queue {
//     static class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static Node head = null;
//     static Node tail = null;

//     public static boolean isEmpty() {
//         return head == null && tail == null;
//     }

//     // Add
//     public static void add(int data) {
//         Node newnode = new Node(data);
//         if (isEmpty()) {
//             head = tail = newnode;
//             return;
//         }
//         tail.next = newnode;
//         tail = newnode;
//     }

//     // Remove
//     public static int remove() {
//         if (isEmpty()) {
//             System.out.println("empty queue");
//             return -1;
//         }
//         int front = head.data;
//         if (head == tail) { // last element
//             head = tail = null;
//         } else {
//             head = head.next;
//         }
//         return front;
//     }

//     // Peek
//     public static int peek() {
//         if (isEmpty()) {
//             System.out.println("empty queue");
//             return -1;
//         }
//         return head.data;
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// java collection framework
// import java.util.*;
// public class queue {
//     public static void main(String args[]) {
//         // Queue<Integer> q = new LinkedList<>();  //arrayDeque<>();
//         Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// queue using 2 stacks
// import java.util.*;
//     public class queue {
//      static class Queue {
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty() {
//             return s1.isEmpty() && s2.isEmpty();
//         }

//         // add 0(n)
//         public static int add(int data) {
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);

//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//             return data;
//         }
//         // remove
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return s1.pop();
//         }
//         // peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return s1.peek();
//         }
//     }
//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


//stack using 2 queues
// import java.util.*;
// public class queue{
//     static class stack{
//         static Queue<Integer>  q1 = new LinkedList<>();
//         static Queue<Integer> q2 = new LinkedList<>();
//         public static boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty();
//         }
//         // push 0(n)
//         public static void push(int data){
//             if(!q1.isEmpty()){
//                 q1.add(data);
            
//             }else{
//                 q2.add(data);
//             }
//         }
//         // pop 0(n)
//         public static int pop(){
//             if(isEmpty()){
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             //case1
//             int top = -1;
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top =q1.remove();
//                     if(q1.isEmpty()){
//                         break;
//                     }
//                     q2.add(top);
//                 }
//                 // case2
//                 } else {
//                 while(!q2.isEmpty()){
//                     top =q2.remove();
//                     if(q2.isEmpty()){
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//     return top;
//         }
//         // peek 0(n)
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top = -1;
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top =q1.remove();
//                     q2.add(top);
//                 }
//             } else {
//                 while(!q2.isEmpty()){
//                     top =q2.remove();
//                     q1.add(top);
//                 }
//             }
//     return top;
//     }

// }
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


//first non repeating character ina  stream
 import java.util.*;

public class queue {
public static char isduplicate(String str) {
    int freq[] = new int[26];
    Queue<Character> q = new LinkedList<>();

    for(int  i = 0; i < str.length();i++){
        char ch = str.charAt(i);
        q.add(ch);
        freq[ch -'a']++;
        while(!q.isEmpty() && freq[q.peek() -'a'] > 1){
            q.remove();
        }
        if(q.isEmpty()){
            System.out.print(-1 + " ");
        } else {
            System.out.print(q.peek() + " ");
        }
    }
    return ' ';
}
    public static void main(String args[]) {
        String str = "aabbccxxb";
        System.out.println(isduplicate(str));
    }
}

    