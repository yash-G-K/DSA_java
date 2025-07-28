
// public class string {
//     public static void printletters(String s) {
//         for(int i =0 ;i < s.length() ; i++) {
//             System.out.print(s.charAt(i) + " ");
//             }
//         System.out.println();
//     }
//     public static void main(String[] args) {
        // String str = "Hello, World!"; //1st method
        // System.out.println(str);
        // System.out.println(str.length());
        // String str2 = new String("yash");//2nd method

        // Scanner sc = new Scanner(System.in);//user taken
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine(); //next only take word but next line take it as whole line
        // System.out.println("Your name is " + name);
        // System.out.println(name.length());


        // sc.close();

        //                         concatination
//         String str = "yash";
//         String str2 = "kumar";
//         String str3 = str + " " + str2;
//         printletters(str3);
//     }
// }



// public class string {
//     public static boolean ispalandrome(String str) {
//         for(int i = 0 ; i < str.length() / 2 ; i++) {
//                   if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
//                     return false;
//             }
//     }
//     return true;
// }
//     public static void main(String[] args) {
//         String str = "racecar";
//         System.out.println(ispalandrome(str));
//     }
// }


public class string {
    public static float shortestpath(String str) {
        int  x = 0, y = 0;
        for(int i = 0 ; i < str.length(); i++) {
             char dir = str.charAt(i) ; 
             if(dir == 'S'){ //south
                y--;
             }
             else if(dir == 'N'){//north
                y++;
             }
             else if(dir == 'E'){//east
                x++;
            }
            else if(dir == 'W'){//west
                x--;
                }
                }
            int X2 =x*x;
            int Y2 = y*y;
            return (float)Math.sqrt(X2 + Y2);
}
    public static void main(String[] args) {
         String str ="WNEENESENNN";
         System.out.println(shortestpath(str));
    }
}