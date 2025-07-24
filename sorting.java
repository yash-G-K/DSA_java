import java.util.*;

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


public class sorting {
    public static void insertion_sort(int arr[]) {
        int n = arr.length;
       for(int i=1;i<n;i++){
        int curr = arr[i];
        int prev = i-1;
        //finding out the  corret position to insert
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1] = arr[prev];
            prev--;
       }
       arr[prev+1] = curr;
    }
    }
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        insertion_sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}