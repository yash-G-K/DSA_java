import java.util.*;

// public class pattern2{
//     public static void main(String args[]){
//         for(int line=1; line<=4;line++){
//             for(int star=1;star<=line;star++){
//                 System.out.print(" * ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// public class pattern2{
//     public static void main(String args[]){
//         int n=4;
//         for(int line=1; line<=n ; line++){
//             for(int star=1;star<=(n-line+1);star++){
//                 System.out.print(" * ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

public class pattern2{
    public static void main(String args[]){
        int n=4;
        for(int line=1; line<=n ; line++){
            //print numbers
            for(int num=1 ; num<=line ;num++){
                System.out.print(num);
                num++;
            }
        System.out.println(" ");
        }
    }
}

// public class pattern2{
//     public static void main(String args[]){
//         int n=4;
//         char ch='A';
//         for(int line=1; line<=n ; line++){
//             for(int chars=1;chars<=line;chars++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println(" ");
//         }
//     }
// }