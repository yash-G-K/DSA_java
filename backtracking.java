

// public class backtracking{
//     public static void change(int arr[],int i,int val){
//         //base case
//         if(i==arr.length){
//             printarr(arr);
//             return;
//         }
//         //recursion
//         arr[i]=val;
//         change(arr,i+1,val+1);
//         arr[i]=arr[i]-2; //backtracking step
//     }

//     public static void printarr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[5];
//         change(arr,0,1);
//         printarr(arr);

//     }
// }


// subseets using backtracking
// public class backtracking{

//     public static void subset(String str, String ans,int i){
//         //base case
//         if(i== str.length()) {
//            if (ans.length() == 0) {
//                 System.out.println("null");
//            } else {
//                 System.out.println(ans);
//       }
//     return;
//     }
//         //recursion
//         //yes choice
//         subset(str,ans+str.charAt(i),i+1);
//         //no choice
//         subset(str,ans,i+1);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subset(str,"",0);
//     }
// }


//       permutations of string using backtracking
// public class backtracking{
//     public static void permute(String str, String ans){
//         //base case
//         if(str.length() == 0){
//             System.out.println(ans);
//             return;
//         }
//         //recursion
//         for(int i=0;i<str.length();i++){
//             char curr = str.charAt(i);
//             String newstr = str.substring(0,i) + str.substring(i+1);
//             permute(newstr,ans+curr);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         permute(str,"");
//     }
// }


//      n queens problem using backtracking
// public class backtracking{
//     public static boolean issafe(char board[][],int row,int col){
//         //verticl up
//         for(int i=row-1; i>=0; i--){
//             if(board[i][col] == 'Q'){
//             return false;
//         }
//         }
//         //left diagonal
//         for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         //right diagonal
//         for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nqueens(char board[][],int row){
//         //base case
//         if(row == board.length){
//             printboard(board);
//             count++;
//             System.out.println("solution count: "+count);
//             return;
//         }
//         //recursion
//         for(int j=0;j<board.length;j++){
//             if(issafe(board,row,j)){
//                 board [row][j] = 'Q';
//                 nqueens(board, row+1);
//                 board[row][j] = 'x'; //backtracking step
//             }
//         }
//     }
//     public static void printboard(char board[][]){
//         System.out.println("-----chess board-----");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//      static int count = 0;
//         public static void main(String[] args) {
//         int n = 5;
//         char board[][] = new char[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j] = 'x';
//             }
//         }
//         nqueens(board,0);
//     }
// }



//      grid unique paths using backtracking
public class backtracking{
    public static int gridpath(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        //recursion
        int w1 = gridpath(i+1,j,n,m);
        int w2 = gridpath(i,j+1,n,m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(gridpath(0,0,n,m));
    }
}
