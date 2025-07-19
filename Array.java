 import java.util.*;

//                                   arrays and call by reference
 
// public class Array {
//     public static void main(String args[]){
//     int marks[] = new int[50];

//     Scanner sc = new Scanner(System.in);
//     marks[0] = sc.nextInt();
//     marks[1] = sc.nextInt();
//     marks[2] = sc.nextInt();

//     System.out.println("phy:"+marks[0]);
//     System.out.println("phy:"+marks[1]);
//     System.out.println("phy:"+marks[2]);

//     marks[0]= marks[0] + 35;
//         System.out.println("phy:"+marks[0]);

// }}

//                                           linear search

// public class Array{
//     public static int search(int num[],int key){
//         for(int i=0 ;i<=num.length;i++){
//             if(num[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int num[] ={1,23,44,66,10,20,30,40};
//         int key = 20;

//         int index = search(num,key);
//         if (index == -1){
//            System.out.println("key not found");
//         }else{
//             System.out.println("key  found " + index);

//         }
//     }
// }

//                                      largest of element


// public class Array{
//     public static int getlargest(int num[]){
//         int largest = Integer.MIN_VALUE;

//         for(int i=0;i<num.length;i++){
//             if (largest <num[i]){
//                 largest = num[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]){
//         int num[]={1,2,3,6,5,4};
//         System.out.println("lrgest vale is" + getlargest(num));
//     }
// }

                                                 //bianry number
// public class Array{
//     public static int binarysearch(int num[],int key){
//       int start = 0 ;
//       int end = num.length-1;

//       while (start <= end){
//              int mid = (start + end) / 2;

//             //comparision
//             if(num[mid] == key){
//                 return mid;
//             }
//             if(num[mid] < key){ //riight
//                 start = mid+1;
//             }else{
//                 end = mid-1; //left
//             }
//       }
//       return -1;
//     }
//     public static void main(String args[]){
//         int num[]={1,2,3,6,5,4,9};
//         int key = 2;
//         System.out.println("key is found at index " + binarysearch(num,key));
//     }
// }

                                //reverse an array
// public class Array{
//     public static void reverse(int num[]){
//       int first =0;
//       int last = num.length-1;

//       while(first < last){
//           int temp = num[last];
//           num[last] = num[first];
//           num[first] = temp;

//           first++;
//           last--;
//       }
//     }
//     public static void main(String args[]){
//         int num[]={1,2,3,6,5,4,9};
//         reverse(num);

//         //print an array
//         for(int i=0 ; i<num.length;i++){
//             System.out.print(num[i]+" ");
//         }
//         System.out.println();
//     }
// }


//                                 pairs on array
// public class Array{
//     public static void printpairs(int num[]){
//         for(int i=0; i<num.length; i++){
//             int curr = num[i];  //2 46 8
//             for(int j=i+1; j<num.length;j++){
//                 System.out.print("(" + curr + "," + num[j] + ")");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int num[]={1,2,3,6,5,4,9};
//         printpairs(num);
//     }
// }


public class Array{
    public static void printpairs(int num[]){
        int tp = 0;  //total pairs
        for(int i=0; i<num.length; i++){
            int curr = num[i];  //2 46 8
            for(int j=i+1; j<num.length;j++){
                System.out.print("(" + curr + "," + num[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs" +tp);
    }
    public static void main(String args[]){
        int num[]={1,2,3,6,5,4,9};
        printpairs(num);
    }
}