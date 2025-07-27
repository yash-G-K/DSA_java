// public class array2D {
//     public static void spiralmatrix(int matrix [][]) {
//         int startrow = 0;
//         int startcol = 0;
//         int endrow = matrix.length - 1;
//         int endcol = matrix[0].length - 1;

//         while (startrow <= endrow && startcol <= endcol) {
//             // top
//             for (int j = startcol; j <= endcol; j++) {
//                 System.out.print(matrix[startrow][j] + " ");
//             }

//             // right
//             for (int i = startrow + 1; i <= endrow; i++) {
//                 System.out.print(matrix[i][endcol] + " ");
//             }
//             // bottom
//             for (int j = endcol - 1; j >= startcol; j--) {
//                 if (startrow == endrow) {
//                     break;
//                 }
//                 System.out.print(matrix[endrow][j] + " ");
//             }
//             // left
//             for (int i = endrow - 1; i > startrow; i--) {
//                 if (startcol == endcol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startcol] + " ");
//             }

//             startcol++;
//             endcol--;
//             startrow++;
//             endrow--;
//         }
//     }

//     public static int diagonalsum(int matrix[][]) {
//         int sum = 0;
//         for (int i = 0; i < matrix.length; i++) {
//             // primary diagonal
//             sum += matrix[i][i];
//             // secondary diagonal
//             if (i != matrix.length - 1 - i) {
//                 sum += matrix[i][matrix.length - 1 - i];
//             }
//         }
//         return sum;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

//         spiralmatrix(matrix);
//         System.out.println();
//         int sum = diagonalsum(matrix);
//         System.out.println("Diagonal sum: " + sum);
//     }
// }


// public class array2D{
//     public static boolean search_matrix(int matrix[][], int key){
//           int row = 0 ,col=matrix[0].length-1;
//           while(row<matrix.length && col>=0){
//              if(matrix[row][col]==key){
//                 System.out.println("found key at ("  + row + "," + col +")" );
//                 return true;
//              }
//              else if (key < matrix[row][col]) {
//                 col--;
//                 }
//                 else {
//                     row++;
//                 }
//              }
//             System.out.println("key not found");
//              return false;
//  }

//        public static void main(String args[]) {
//         int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//         int key =8 ;
//         search_matrix(matrix,key);
//        }
// }



public class array2D{
    public static boolean search_matrix(int matrix[][], int key){
          int row = matrix.length-1 ,col=0;
          while(col<matrix[0].length && row>=0){
             if(matrix[row][col]==key){
                System.out.println("found key at ("  + row + "," + col +")" );
                return true;
             }
             else if (key < matrix[row][col]) {
                row--;
                }
                else {
                col++;
                }
             }
            System.out.println("key not found");
             return false;
 }

       public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int key = 10 ;
        search_matrix(matrix,key);
       }
}