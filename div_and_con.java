
//                  Merge sort
// public class div_and_con{
//     public static void printarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//             }
//     }
//     public static void mergesort(int arr[],int si,int ei) {
//         //kaaaam
//         if(si>=ei)
//         return;
//         int mid=si+(ei-si)/2;     //(si+ei)/2
//         mergesort(arr,si,mid);
//         mergesort(arr,mid+1,ei);
//         merge(arr,si,mid,ei);
//     }
//     public static void merge(int arr[],int si,int mid,int ei) {
//         int temp[] = new int[ei - si + 1];
//         int i = si;  //iterator for left
//         int j = mid + 1;  //iterator for right
//         int k = 0;  //iterator for temp array
        
//         while(i <= mid && j <= ei) {
//             if(arr[i] <= arr[j]) {
//                 temp[k++] = arr[i++];
//             } else {
//                 temp[k++] = arr[j++];
//             }
//         }
        
//         // Copy remaining elements from left
//         while(i <= mid) {
//             temp[k++] = arr[i++];
//         }
        
//         // Copy remaining elements from right
//         while(j <= ei) {
//             temp[k++] = arr[j++];
//         }
        
//         // Copy temp back to arr
//         for(k = 0, i = si; k < temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {6, 3, 9, 5, 2, 8};
//         mergesort(arr, 0, arr.length - 1);
//         printarr(arr);
//  }
// }


//                   quicksort
// public class div_and_con {
//     public static void main(String[] args) {
//         int arr[] = {6, 3, 9, 5, 2, 5};
//         quicksort(arr, 0, arr.length - 1); // Corrected argument order
//         printarr(arr);
//     }

//     public static void quicksort(int arr[], int si, int ei) {
//         if (si >= ei) { // Base case: If start index is greater or equal to end index, subarray is sorted.
//             return;
//         }

//         int pidx = partition(arr, si, ei); // Find the partition index.

//         // Recursively sort the left and right subarrays
//         quicksort(arr, si, pidx - 1);
//         quicksort(arr, pidx + 1, ei);
//     }

//     public static int partition(int arr[], int si, int ei) {
//         int pivot = arr[ei]; // Choosing the last element as the pivot.
//         int i = si - 1; // Initialize 'i' as one less than the starting index.

//         for (int j = si; j < ei; j++) { // Loop from the start index to the element before the pivot
//             if (arr[j] <= pivot) { // If the current element is less than or equal to the pivot
//                 i++; // Increment 'i'
//                 // Swap arr[i] and arr[j] to place smaller elements before the pivot
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }

//         i++; // Move 'i' to the next position to place the pivot correctly
//         // Swap the pivot with the element at arr[i]
//         int temp = arr[ei];
//         arr[ei] = arr[i];
//         arr[i] = temp;

//         return i; // Return the partition index (the final position of the pivot)
//     }

//     public static void printarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }


// search in a rotated sorted array
public class div_and_con{

    public static int search(int arr[],int tar, int si,int ei){
        //kaam 
    if(si > ei){
        return  -1;
    }

        int mid  = si + (ei-si)/2;
        //case
        if(arr[mid] == tar){
            return mid;
        }

       //             mid on l1`
    if(arr[si] <= arr[mid]){
        // case a :left
        if(arr[si] <= tar && tar <=arr[mid]){
            return search(arr, tar, si, mid-1);
        }else{
            //case b: right
            return search(arr,tar,mid+1,ei);
        }
    }

        //mid on line 2
        else{
            // case c: right
            if(arr[mid] <=tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                // case d : left
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target = 0;
        int taridx = search(arr,target,0, arr.length-1);
        System.out.println(taridx);
    }
}
