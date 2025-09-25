
import java.util.Stack;

public class stack2 {
    public static void maxarea(int arr[]) {
        int maxarea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        // Next Smaller Right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>(); // reset stack
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Calculate the Area of histogram
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxarea = Math.max(currArea, maxarea);
        }

        System.out.println("Max area of histogram = " + maxarea);
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        maxarea(arr);
    }
}
