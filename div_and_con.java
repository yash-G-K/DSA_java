
//                  Merge sort
public class div_and_con{
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
    }
    public static void mergesort(int arr[],int si,int ei) {
        //kaaaam
        if(si>=ei)
        return;
        int mid=si+(ei-si)/2;     //(si+ei)/2
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;  //iterator for left
        int j = mid + 1;  //iterator for right
        int k = 0;  //iterator for temp array
        
        while(i <= mid && j <= ei) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
        // Copy remaining elements from left
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        
        // Copy remaining elements from right
        while(j <= ei) {
            temp[k++] = arr[j++];
        }
        
        // Copy temp back to arr
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergesort(arr, 0, arr.length - 1);
        printarr(arr);
 }
}