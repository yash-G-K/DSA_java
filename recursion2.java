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
public class recursion2 {
    public static void removeduplicates(String str, int idx, StringBuilder newstr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        
        // Check if the character is a lowercase letter before accessing the map
        if (currchar >= 'a' && currchar <= 'z') {
            if (map[currchar - 'a']) {
                removeduplicates(str, idx + 1, newstr, map);
            } else {
                map[currchar - 'a'] = true;
                removeduplicates(str, idx + 1, newstr.append(currchar), map);
            }
        } else {
            // If not a lowercase letter, append it and continue
            removeduplicates(str, idx + 1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "yash kalbhute";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
 