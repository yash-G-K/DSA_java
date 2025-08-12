//               tiling problem

// public class recursion2{
//     public static int tilingproblem(int n){ // 2 x n floor
//     //base case
//     if(n ==1 || n==0){
//         return 1;
//     }
//     //kaam
//     //vertical chioices
//     int fnm1 = tilingproblem(n-1);

//     //horizonatal choices 
//     int fnm2 = tilingproblem(n-2);

//      int toways=fnm1 + fnm2;
//      return toways;
//     }
//     public static void main(String[] args) {
//         System.out.println(tilingproblem(7));
        
//     }

// }


//         remove duplicate from the string
// public class recursion2 {
//     public static void removeduplicates(String str, int idx, StringBuilder newstr, boolean[] map) {
//         if (idx == str.length()) {
//             System.out.println(newstr);
//             return;
//         }

//         char currchar = str.charAt(idx);
        
//         // Check if the character is a lowercase letter before accessing the map
//         if (currchar >= 'a' && currchar <= 'z') {
//             if (map[currchar - 'a']) {
//                 removeduplicates(str, idx + 1, newstr, map);
//             } else {
//                 map[currchar - 'a'] = true;
//                 removeduplicates(str, idx + 1, newstr.append(currchar), map);
//             }
//         } else {
//             // If not a lowercase letter, append it and continue
//             removeduplicates(str, idx + 1, newstr.append(currchar), map);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "yash kalbhute";
//         removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     }
//}
 


//              friends pairing problem
// Given n friends, each one can remain single or can be paired up with
//  some other friend. Each friend can be paired only once. Find out the 
//  total number of ways in which friends can remain 
//  single or can be paired up.

// public class recursion2{
// public static int friendspairing(int n){
//     if(n==1 || n==2){
//         return n;
//     }
// //    single choices
//      int  fnm1 = friendspairing(n-1);

//      // pairing
//      int fnm2 = friendspairing(n-2);
//      int pairways = (n-1) * (n-2);

//      //total pairing
//      int totalways = fnm1 + pairways;
//          return totalways;

//       // return friendspairing (n-1) + (n-1) * friendspairing(n-2);
// }
//     public static void main(String[] args) {
//         int  n=3;
//         System.out.println(friendspairing(n));
//     }
// }


//                     Binary string problem
// print all binary strings of size N without consecutive ones.
// public class recursion2{
//     public static void binarystring(int n, int lastplace,  String str){
//         if(n==0){
//             System.out.println(str);
//             return;
//             }
//         binarystring(n-1, 0, str+"0");
//         if(lastplace == 0){
//         binarystring(n-1, 1, str+"1");
//     }
//     }
//     public static void main(String[] args) {
//     int n=3;
//     binarystring(n, 0, "");
//     }
// }

public class recursion2{
    public static void binarystring(int n, int lastplace,  String str){
        if(n==0){
            System.out.println(str);
            return;
            }
        binarystring(n-1, 0, str+"0");
        if(lastplace == 0){
        binarystring(n-1, 1, str+"1");
    }
    }
    public static void main(String[] args) {
    int n=3;
    binarystring(n, 0, "");
    }
}