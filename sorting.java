// import java.util.*;

//                                     bubble sorting
// public class sorting {
//     public static void bubblesort(int arr[]) {
//         int temp;
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         bubblesort(arr);
//         System.out.println("Sorted array: " + Arrays.toString(arr));
//     }
// }


//                                        selection sort

// public class sorting {
//     public static void selection_sort(int arr[]) {
//         int n = arr.length;
//         for(int i = 0;i<n-1;i++){
//             int minpose = i;
//             for(int j = i+1;j<n;j++){
//                 if (arr[minpose] > arr[j]){
//                     minpose =j;
//                 }

//             }
//             // swapping
//             int temp = arr[minpose];
//             arr[minpose] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         selection_sort(arr);
//         System.out.println("Sorted array: " + Arrays.toString(arr));
//     }
// }

//                                              insertion sort
// public class sorting {
//     public static void insertion_sort(int arr[]) {
//         int n = arr.length;
//        for(int i=1;i<n;i++){
//         int curr = arr[i];
//         int prev = i-1;
//         //finding out the  corret position to insert
//         while(prev>=0 && arr[prev]>curr){
//             arr[prev+1] = arr[prev];
//             prev--;
//        }
//        arr[prev+1] = curr;
//     }
//     }
//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         insertion_sort(arr);
//         System.out.println("Sorted array: " + Arrays.toString(arr));
//     }
// }

//                                        inbuilt sort

// import java.util.Arrays;
// import java.util.Collections;
// public class sorting {
//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         Arrays.sort(arr);
//         System.out.println("Sorted array: " + Arrays.toString(arr));
//         Arrays.sort(arr,0,3);
//         System.out.println("Sorted array: " + Arrays.toString(arr));        
//     }
// }

// import java.util.Arrays;
// import java.util.Collections;
// public class sorting {
//     public static void main(String args[]) {
//         Integer arr[] = {5, 4, 1, 3, 2};          //this integer is object type 
//         Arrays.sort(arr,Collections.reverseOrder());
//         System.out.println("Sorted array: " + Arrays.toString(arr));
//         Arrays.sort(arr,0,3,Collections.reverseOrder());
//         System.out.println("Sorted array: " + Arrays.toString(arr));        
//     }
// }


//                                         counting sort
import java.util.*;
public class sorting {
    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length ; i++){
            largest = Math.max(largest ,arr[i]);
        }
        int count[]= new int[largest+1];
        for(int i=0; i<arr.length ; i++){
            count[arr[i]]++;
    }
    //sorting
    int j=0;
    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j] =i;
            j++;
            count[i]--;
        }
    }
}
public static void main(String[] args) {
    int arr[] = {1,2,3,1,6,8,2,3,2,2};
    countingsort(arr);
    System.out.println("counting sort =" + Arrays.toString(arr));

}
}