// import java.util.PriorityQueue;
// public class heaps{
//     public static class student implements Comparable<student>{
//         String name;    
//         int rank;
//         public student(String name, int rank){
//             this.name = name;
//             this.rank = rank;
//         }
//         @Override
//         public int compareTo(student s2){
//             return this.rank - s2.rank;  //ascending order
//             // return s2.rank - this.rank;  //descending order
//         }
//         @Override
//         public String toString() {
//             return "Student{name='" + name + "', rank=" + rank + "}";
//         }
//     }

//     public static void main(String[] args) {
//         PriorityQueue<student> pq  = new PriorityQueue<>();
//         pq.add(new student("A", 4));  //o(log n)
//         pq.add(new student("B", 6));  //o(log n)
//         pq.add(new student("C", 10));  //o(log n)
//         pq.add(new student("D", 11));  //o(log n)

//         while(!pq.isEmpty()){
//             System.out.println(pq.peek());  //o(1)
//             pq.remove(); //o(log n)
//         }
//     }
// }


//  Insert opearation - O(log n) in heap
import java.util.*;
public class heaps{
    public static class heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);

            int x = arr.size() - 1; //child index
            int par = (x - 1) / 2; //parent index

            while(arr.get(x) < arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                
                x = par;
                par = (x - 1) / 2;
            }
        }
    }

    public static void main(String[] args) {
        heap h = new heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        System.out.println(h.arr);
    }
}