import java.util.*;

public class sorting {
    public static void bubblesort(int arr[]) {
        int temp;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        bubblesort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
