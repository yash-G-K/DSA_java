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


//.          SWAPPING OF ARRAYLIST
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


// multi dimensional arraylist 
// import java.util.ArrayList;
// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         list1.add(1);
//         list1.add(2);
//         list1.add(3);
//         mainlist.add(list1);

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(4);
//         list2.add(5);
//         list2.add(6);
//         mainlist.add(list2);

//         for(int i = 0 ; i<mainlist.size(); i++){
//             ArrayList<Integer> currlist = mainlist.get(i);
//             for(int j =0; j<currlist.size(); j++){
//                 System.out.print(currlist.get(j)+" ");
//             }
//             System.out.println();
//     }
//     System.out.print("mainlist = " + mainlist);
//     }
// }

// import java.util.ArrayList;
// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();

//         for(int i = 1; i<=5; i++){
//             list1.add(i*1);
//             list2.add(i*2);
//             list3.add(i*3);
//         }
//             mainlist.add(list1);
//             mainlist.add(list2);
//             mainlist.add(list3);

//             System.out.println("MainList ="  + mainlist);

//         for(int a = 0; a < mainlist.size(); a++){
//             ArrayList<Integer> currlist = mainlist.get(a);
//             for(int b =0; b< currlist.size(); b++){
//                 System.out.print(currlist.get(b)+" ");
//             }
//             System.out.println();
//         }
//         System.out.print("mainlist = " + mainlist);
//     }
// }



// Container with most 
// import java.util.ArrayList;
// public class arraylist {
// public static int maxArea(ArrayList<Integer> height) {
//     int maxarea = 0;
//     //brute force approach O(n^2)
//     int n = height.size();
//     for(int i = 0; i < n; i++){
//         for(int j = i+1; j < n; j++){
//             int ht = Math.min(height.get(i), height.get(j));
//             int width = j - i;
//             int area = ht * width;
//             maxarea = Math.max(maxarea, area);
//         }
//     }
//     return maxarea;
// }

// public static void main(String args[]) {
// ArrayList<Integer> height = new ArrayList<>(); //1, 8, 6, 2, 5, 4, 8, 3, 7
// height.add(1); 
// height.add(8);
// height.add(6);
// height.add(2);
// height.add(5);
// height.add(4);
// height.add(8);
// height.add(3);
// height.add(7);

// System.out.println("The maximum area is: " + maxArea(height));

// }
// }


// 2 pointer approach optimed approach O(n)
// import java.util.ArrayList;
// public class arraylist {
//         public static int maxArea(ArrayList<Integer> height) {
//             int maxarea = 0;
//             int lp=0;
//             int rp=height.size()-1;

//             while(lp<rp){
//                 int ht = Math.min(height.get(lp), height.get(rp));
//                 int width = rp-lp;
//                 int currwater = ht * width;
//                 maxarea = Math.max(maxarea, currwater);

//                 if(height.get(lp) < height.get(rp)){
//                     lp++;
//                     }else{
//                         rp--;
//                     }
//                 }
//             return maxarea;
// }
//         public static void main(String args[]) {
//         ArrayList<Integer> height = new ArrayList<>(); //1, 8, 6, 2, 5, 4, 8, 3, 7
//         height.add(1); 
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println("The maximum area is: " + maxArea(height));
    
//         }
// }


// pair-1 sum problrm in sorted arraylist
// import java.util.ArrayList;
// public class arraylist {
//     public static boolean pairSum(ArrayList<Integer> list, int target){
//         //brute force approach O(n^2)
//         int n = list.size();
//         for(int i = 0; i<n; i++){
//               for(int j =i+1; j<n; j++){
//                 int Goal = list.get(i) + list.get(j);
//                 if(Goal == target){
//                     System.out.println("Pair found at index " + i + " and " + j);
//                     return true;
//                 }
//               }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         int target = 9;
//         pairSum(list, target);
//     }    
// }


//      pair sum -2 problem in sorted arraylist
import java.util.ArrayList;
public class arraylist {
    public static boolean pairsum2(ArrayList<Integer> list, int target){
        int bp = -1; //breaking point
        for(int i=0;i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        } 
        int lp = bp+1; //smallest element
        int rp = bp; //largest element
        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                System.out.println("Pair found at index " + lp + " and " + rp);
                return true;
            }
            //case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % list.size(); //to make it circular
            }else{
                rp = (list.size() + rp - 1) % list.size(); //to make it circular
            }
        }
        return false;
    }
public static void main(String args[]) {
ArrayList<Integer> list = new ArrayList<>();
//11, 15, 6, 8, 9, 10
list.add(11);
list.add(15);
list.add(6);
list.add(8);
list.add(9);
list.add(10);
int target = 16;
pairsum2(list, target);
}
}
