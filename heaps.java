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
// import java.util.*;
// public class heaps{
//     public static class heap{
//         ArrayList<Integer> arr = new ArrayList<>();
//         public void add(int data){
//             arr.add(data);

//             int x = arr.size() - 1; //child index
//             int par = (x - 1) / 2; //parent index

//             while(arr.get(x) < arr.get(par)){
//                 //swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);
                
//                 x = par;
//                 par = (x - 1) / 2;
//             }
//         }
//         public int peek(){
//             return arr.get(0);
//         }

//         private void heapify(int i){
//             int left = 2 * i + 1;
//             int right = 2 * i + 2;
//             int minIdx = i;

//             if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
//                 minIdx = left;
//             }

//             if(right <arr.size() && arr.get(minIdx) > arr.get(right)){
//                 minIdx = right;
//             }

//             if( minIdx != i){
//                 //swap
//                 int temp = arr.get(i);
//                 arr.set(i , arr.get(minIdx));
//                 arr.set(minIdx, temp);

//                 heapify(minIdx);
//                 return;
//             }
//         }

//         public boolean isEmpty(){
//             return arr.size() == 0;
//         }

//     public int remove(){
//         int data  = arr.get(0);
//         //step1 - swap first and last
//         int temp = arr.get(0);
//         arr.set(0,arr.get(arr.size() - 1));
//         arr.set(arr.size() - 1, temp);

//         //step2 - remove last
//         arr.remove(arr.size() - 1);
//         //step3 - heapify
//         heapify(0);
//         return data;
//     }
//     }

//     public static void main(String[] args) {
//         heap h = new heap();
//         h.add(3);
//         h.add(4);
//         h.add(1);
//         h.add(5);
//         System.out.println(h.arr);

//         while(!h.isEmpty()){
//             System.out.println(h.peek());
//             h.remove();
//         }
//     }
// }


// heap sort 
// public class heaps{
//     public static void heapify(int arr[], int i, int n){
//         int left = 2 *i + 1;
//         int right = 2 * i + 2;
//         int maxIdx = i;
//         if(left < arr.length && arr[left] > arr[maxIdx]){
//             maxIdx = left;
//         }

//         if(right < arr.length && arr[right] > arr[maxIdx]){
//             maxIdx = right;
//         }

//         if(maxIdx != i){
//             //swap 
//             int temp = arr[i];
//             arr[i] = arr[maxIdx];
//             arr[maxIdx] = temp;

//             heapify(arr, maxIdx, n);
//             return;
//         }
//     }

//     public void heapSort(int arr[]){
//         //step1 - build heap
//         int n = arr.length;
//         for(int i = n/2; i >= 0; i--){
//             heapify(arr, i, n);
//         }

//         //step2 - swap and heapify
//         for(int i = n - 1; i > 0; i--){
//             //swap
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr, 0, i);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,5,3,4,2};
//         heaps h = new heaps();
//         h.heapSort(arr);
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }  
//     }   
// }


// nearby cars
// import java.util.*;
// public class heaps{
//     public static class point implements Comparable<point> {
//         int x;
//         int y;
//         int distsq;
//         public point(int x, int y, int distsq){
//             this.x = x;
//             this.y = y;
//             this.distsq = distsq;
//         }
//         @Override
//         public int compareTo(point p2){
//             return this.distsq - p2.distsq;  //ascending order
//         }
//     }
//     public static void main(String[] args) {
//         int pts[][] = {{3,3}, {5,-1}, {-2,4}};
//         int k = 2;

//         PriorityQueue<point> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for (int[] pt : pts) {
//             int x = pt[0];
//             int y = pt[1];
//             int distsq = x*x + y*y;
//             pq.add(new point(x, y, distsq));

//             //keep k smallest distance
//             if(pq.size() > k){
//                 pq.remove();
//             }
//         }
//     }
// }


//connecting n ropes with minimum cost
// import java.util.*;
// public class heaps{
//     public static void main(String[] args) {
//         int ropes[] = { 2, 3, 3, 4, 6 };
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i = 0; i < ropes.length; i++){
//             pq.add(ropes[i]);
//         }
//         int  cost = 0;
//         while(pq.size() > 1){
//             int first = pq.remove();
//             int second = pq.remove();
//             int sum = first + second;
//             cost += sum;
//             pq.add(sum);
//         }   
//         System.out.println("Minimum cost to connect ropes: " + cost);
//     }
// }


// weakest soldiers
import java.util.*;
public class heaps{
    public static class row implements Comparable<row>{
        int soldiers;
        int idx;
        public row(int soldiers, int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }
        @Override
        public int compareTo(row r2){
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx;
            } else {
                return this.soldiers - r2.soldiers; //ascending order
            }
        }
    }

    public static void main(String[] args) {
        int army[][] = {{1,0,0,0}, {1,0,0,0}, {1,1,1,1}, {1,0,0,0}};
        int k = 2;

        PriorityQueue<row> pq =new PriorityQueue<>();
        for(int j = 0; j < army.length; j++){
            int count = 0;
            for(int i = 0; i < army[0].length; i++){
                count += army[j][i] ==1 ? 1 : 0;
            }
            pq.add(new row(count, j));
        }
        for(int i = 0; i < k; i++){
            System.out.println(pq.remove().idx);
        }
    }
}