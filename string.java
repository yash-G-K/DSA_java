
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


//                                 palandrome or not
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

//                               shortest path
// public class string {
//     public static float shortestpath(String str) {
//         int  x = 0, y = 0;
//         for(int i = 0 ; i < str.length(); i++) {
//              char dir = str.charAt(i) ; 
//              if(dir == 'S'){ //south
//                 y--;
//              }
//              else if(dir == 'N'){//north
//                 y++;
//              }
//              else if(dir == 'E'){//east
//                 x++;
//             }
//             else if(dir == 'W'){//west
//                 x--;
//                 }
//                 }
//             int X2 =x*x;
//             int Y2 = y*y;
//             return (float)Math.sqrt(X2 + Y2);
// }
//     public static void main(String[] args) {
//          String str ="WNEENESENNN";
//          System.out.println(shortestpath(str));
//     }
// }

//                                        substring
// public class string { //function creted to find substirng
//     public static String substring(String str,int si,int ei) {
//         String sub = "  ";
//         for(int i =si; i<ei;i++){
//             sub +=str.charAt(i);
//             }
//             return sub;
//         }
//     public static void main(String[] args) {
//          String str = "yash kalbhute" ;
//          System.out.println(substring(str,0,5));
//          System.out.println(str.substring(0,5));//inbuilt function for substtring
//     }
// }

//                                        longest string

// public class string {
//     public static void main(String[] args) {
//         String fruits[] = {"banana","apple","mango"};
//         String largest = fruits[0];
//         for(int i = 0 ; i < fruits.length ; i++){
//             if(largest.compareTo(fruits[i])< 0){
//                 largest = fruits[i];
//                 }
//                 }
//                 System.out.println(largest);
//     }
// }

// //                             string builder
// public class string {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("");
//         for(char ch = 'a'; ch <= 'z'; ch++){
//             sb.append(ch);
//         }
//         //O(26)
//         System.out.println(sb); //abc...xyz
//      }
// }

// //                                 string first word  to uppercase
// public class string {
//     public static StringBuilder touppercase(String str){
//         StringBuilder sb =new StringBuilder("") ;

//         char ch = Character.toUpperCase(str.charAt(0));
//         for(int i = 0 ; i < str.length() ; i++){
//             if(str.charAt(i) == ' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             } else{
//                 sb.append(str.charAt(i));
//             }

//     }
//     return sb;
//     }
//     public static void main(String[] args) {
//         String str = "yash kalbhute i am here" ;
//     System.out.println(touppercase(str));
//      }
// }


///                               string compression
// public class string {
//     public static String compress(String str) {
//         String newstr="";
//         for(int i = 0;i <str.length();i++){
//             Integer count = 1;
//             while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newstr += str.charAt(i);
//             if(count > 1){
//                 newstr += count.toString();
//     }
//     }
//     return newstr;
//     }
//     public static void main(String[] args) {
//         String str = "aabcccccaaa" ;
//         System.out.println(compress(str)); //a2b1c5a3
//  }
// }


import java.util.Scanner;
public class string{

    public static void main(String[]args) {
        String str=new Scanner(System.in).next();
        int count=0;for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;}
                }
                System.out.println("count of vowels is :"+count);
                 }
                }