//                     hollow rectangle

// public class advpattern {
//     public static void hollow_ractangle(int totrows, int totcols) {
//         // outer loop
//         for (int i = 1; i <= totrows; i++) {
//             // inner loop
//             for (int j = 1; j <= totcols; j++) {
//                 // cell -(i,j)
//                 if (i == 1 || i == totrows || j == 1 || j == totcols) {
//                     // boundary cells
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(); // move to next line after one row
//         }
//     }

//     public static void main(String args[]) {
//         hollow_ractangle(3, 7);
//     }
// }

                                   //right angled half pyramid
// public class advpattern {
//     public static void inverted_triangle(int n) {
//         //outer
//         for(int i=1;i<=n;i++){
//             //inner spaces
//             for(int j=1;j<=n-1;j++){
//                 System.out.print(" ");
//             }
//             //inner stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         inverted_triangle(5);
//     }
// }

                   //                          number pyramid
// public class advpattern {
//     public static void inverted_halfpyramid(int n) {
//         //outer
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         inverted_halfpyramid(5);
//     }
// }


                                  //floydd pyramid
public class advpattern {
    public static void floyd_pyramid(int n) {
        int counter =1 ;
        //outer
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
       floyd_pyramid(5);
    }
}