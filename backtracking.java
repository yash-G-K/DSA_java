

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
public class backtracking{

    public static void subset(String str, String ans,int i){
        //base case
        if(i== str.length()) {
           if (ans.length() == 0) {
                System.out.println("null");
           } else {
                System.out.println(ans);
      }
    return;
    }
        //recursion
        //yes choice
        subset(str,ans+str.charAt(i),i+1);
        //no choice
        subset(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subset(str,"",0);
    }
}