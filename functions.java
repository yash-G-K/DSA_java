// public class functions{
//     public static void printh(){
//         System.out.println("This is a function");
//     }
//     public static void main(String args[]){
//         printh();
//     }

// }

//                                  parameter function
// import java.util.*;
// public class functions{
//      public static void calsum(int a,int b){ //formal parameters
//         int sum =a+b;
//         System.out.println("sum is" + sum );
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a =sc.nextInt();
//         int b =sc.nextInt();
//         calsum(a,b); //actual paramerters
//     }
//  }

//                           call by reference

//  import java.util.*;
// public class functions{
//      public static int product(int a,int b){ //formal parameters
//         int mul =a*b;
//         return mul;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a =sc.nextInt();
//         int b =sc.nextInt();
//         int prod = product(a,b);
//         System.out.println("product of a and b" + prod);
//     }
//  }

                       //factorial of a number
//  import java.util.*;
// public class functions{
//      public static int factorial(int n){ //formal parameters
//            int f =1;
//            for(int i=1;i<=n;i++){
//               f = f* i;
//            }  
//         return f;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num =sc.nextInt();
//         int fact = factorial(num);
//         System.out.println("factorial of n" + fact);
//     }
//  }

                                //binomail coefficient
// import java.util.*;

// public class functions {

//     public static int factorial(int n) { // formal parameters
//         int f = 1;
//         for (int i = 1; i <= n; i++) {
//             f = f * i;
//         }
//         return f;
//     }

//     public static int bincoeff(int n, int r) {
//         int fact_n = factorial(n);         // Corrected: fact_n = factorial(n)
//         int fact_r = factorial(r);         // Corrected: fact_r = factorial(r)
//         int fact_nmr = factorial(n - r);

//         int bincoeff = fact_n / (fact_r * fact_nmr);
//         return bincoeff;
//     }

//     public static void main(String args[]) {
//         System.out.println(bincoeff(5, 1));  // Output should be 5
//     }
// }


                              //method overloading using paraeters
// import java.util.*;
// public class functions {
//     public static int sum(int a,int b){
//         return a+b;
//     }
//         public static int sum(int a,int b,int c){
//         return a+b+c;
//     }
// public static void main(String args[]){ 
//     System.out.println(sum(1,2));
//     System.out.println(sum(1,2,3));
// }
// }

                                //method overloadng using data types
// import java.util.*;
public class functions {
    public static int sum(int a,int b){
        return a+b;
    }
        public static float sum(float a,float b){
        return a+b;
    }
public static void main(String args[]){ 
    System.out.println(sum(1,2));
    System.out.println(sum(3f,2f));
}
}