import java.util.PriorityQueue;
public class heaps{
    public static class student implements Comparable<student>{
        String name;    
        int rank;
        public student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;  //ascending order
            // return s2.rank - this.rank;  //descending order
        }
        @Override
        public String toString() {
            return "Student{name='" + name + "', rank=" + rank + "}";
        }
    }

    public static void main(String[] args) {
        PriorityQueue<student> pq  = new PriorityQueue<>();
        pq.add(new student("A", 4));  //o(log n)
        pq.add(new student("B", 6));  //o(log n)
        pq.add(new student("C", 10));  //o(log n)
        pq.add(new student("D", 11));  //o(log n)

        while(!pq.isEmpty()){
            System.out.println(pq.peek());  //o(1)
            pq.remove(); //o(log n)
        }
    }
}