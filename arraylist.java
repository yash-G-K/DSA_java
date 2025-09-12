// import java.util.ArrayList;
//  public class arraylist{
//     public static void main(String[] args) {
//         //classname<datatype> refvariablename = new classname<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         System.out.println(list);
//         list2.add("Hello");
//         list2.add("World");

//         System.out.println(list2);

//         // get operation
//         System.out.println(list.get(2));   

//         // remove operation
//         list.remove(2);
//         System.out.println(list);

//         // set operation at index
//         list.set(0, 99);
//         System.out.println(list);

//         //contains operation
//         System.out.println(list.contains(99));
//         System.out.println(list.contains(3));

//         // size operation
//         System.out.println(list.size());

//         list.add(2, 3);
//         System.out.println(list);

//         // iteration print arraylist
//         for(int i=0; i<list.size(); i++){
//             System.out.print(list.get(i)+" ");
//         }
//         System.out.println();
//     }
//  }


// reverse an arraylist
// import java.util.ArrayList;
// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println("Original list: " + list);

//         //print reverse list
//     for(int i =list.size()-1; i>=0; i--){
//         System.out.print(list.get(i)+" ");  
//     }
//     System.out.println();
//     }
// }


// maximum in arraylist
// import java.util.ArrayList;
// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(8);
//         list.add(3);
//         list.add(12);
//         list.add(5);
//         System.out.println("Original list: " + list);

//         //maximum of arraylist
//         int max = Integer.MIN_VALUE;    
//     for(int i = 0; i< list.size() ; i++){
//         if(list.get(i) > max){
//             max  = list.get(i);
//         }
//     }
//     System.out.println("MAX ELEMENT =" +max);
//     }
// }


// SWAPPING OF ARRAYLIST
// import java.util.ArrayList;
// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(8);
//         list.add(3);
//         list.add(12);
//         list.add(5);
//         System.out.println("Original list: " + list);

//         // SWAPPING OF 2 ELEMENTS
//         int idx1 = 1, idx2 = 3;
//         swap(list, idx1, idx2);
//         System.out.println("After swapping: " + list);
//     }

//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }
// }


//  sorting an arraylist
// import java.util.ArrayList;
// import java.util.Collections;
// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(8);
//         list.add(3);
//         list.add(12);
//         list.add(5);
//         System.out.println("Original list: " + list);

//        Collections.sort(list);   //ascending order
//        // Collections.sort(list, Collections.reverseOrder()); //descending order
//        System.out.println("Sorted list: " + list);

//        Collections.sort(list, Collections.reverseOrder()); //descending order
//        System.out.println("Sorted list in descending order: " + list);
//     }
// }