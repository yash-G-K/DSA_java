// import java.util.Scanner;
// public class array2D {
//     public static boolean search(int[][] matrix, int key) {
//         for (int i = 0; i < matrix.length; i++) {
//             for(int j = 0; j < matrix[0].length ; j++) {
//                 if(matrix[i][j] == key){
//                     System.out.println("found at cell " + i + " " + j);
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;

//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix, 5);
//         sc.close();
//     } 
// }


//                       imp spiral matrix

public class array2D {
    public static void spiralmatrix(int matrix [][]) {
        int startrow =0;
        int startcol =0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){
            //top
            for(int j = startcol; j<=endcol; j++){
                System.out.print(matrix[startrow][j] + " ");
            }

            //right
            for(int i =startrow+1; i<=endrow ; i++){
                System.out.print(matrix[i][endcol] + " ");
            }
            //bottom
            for(int j = endcol-1; j>=startcol; j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            //left
            for(int i = endrow-1; i>startrow; i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }

            startcol++;
            endcol--;
            startrow++;
            endrow--;
        }
    }
    public static void main(String args[]){
        int matrix[][] ={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        
        spiralmatrix(matrix);
        
    }
}
