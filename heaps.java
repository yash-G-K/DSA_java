import java.util.Comparator;
import java.util.PriorityQueue;
public class heaps{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(4);  //o(log n)
        pq.add(1);
        pq.add(3);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());  //o(1)
            pq.remove(); //o(log n)
        }
    }
}