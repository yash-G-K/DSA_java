//                      recursion
// print no from n to 1 (decreasing order)

// public class recursion{
//     public static void numbersdec(int n) {
//         if (n == 1) {
//             System.out.print(n);
//             return;
//     }
//     System.out.print(n +" ");
//     numbersdec(n-1);
//     }

//     public static void num_inc(int n) {
//             if (n == 1) {
//                 System.out.print(n);
//             return;
//     }
//         num_inc(n-1);
//         System.out.print(n +" ");

        
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         numbersdec(n);
//         num_inc(n);
// }
// }



//       factorial of a number using recursion

// public class recursion {
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println("Factorial of " + n + " is " + factorial(n));
//         }
//         public static int factorial(int n) {
//             if (n == 0 || n == 1) {
//                 return 1;
//                 }
//                 int fnm1 = factorial(n-1);
//                 int fn = n * factorial(n-1);
//                 return fn;
//                 }
//                 }



//       print sum of n natural numbers
// public class recursion {
//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("Sum of " + n + " natural numbers is " + sum(n));
//         }
//         public static int sum(int n) {
//             if (n == 1) {
//                 return 1;
//                 }
//                 int sum1 = sum(n-1);
//                 int sum = n + sum(n-1);
//                 return sum;
//         }
//}


// print nth fibonacci number using recursion
// public class recursion{
//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
        
// }
// public static int fibonacci(int n) {
//     if (n == 0) {
//         return 0;
//         }
//         if (n == 1) {
//             return 1;
//         }
//         int fibnm2 = fibonacci(n-2);
//         int fibnm1 = fibonacci(n-1);
//         int fibn = fibnm2 + fibnm1;
//         return fibn;
//         }
//         }


 
// array is sorted or not using recursion
 public class recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
        }
        public static boolean isSorted(int[] arr, int i) {
            if(i == arr.length-1){
                return true;
            }
            if(arr[i] > arr[i+1]){
                return false;
           
        }
        return isSorted(arr, i+1);
        }
 }