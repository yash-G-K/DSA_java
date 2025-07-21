//                                  //brute force method maxsumof subarray
// public class array2 {
//     public static void max_sumofarray(int num[]) {
//         int maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i < num.length; i++) {
//             int currsum = 0;
//             for (int j = i; j < num.length; j++) {
//                 currsum += num[j];
//                 if (currsum > maxSum) {
//                     maxSum = currsum;
//                 }
//             }
//         }
//         System.out.print("maxsum " + maxSum);
//     }

//     public static void main(String args[]) {
//         int num[] = {1, 2, 3, 6, 5, 4, 9};
//         max_sumofarray(num);
//     }
// }

//                                        maxsum of array prefic sum

// public class array2 {

//     public static void prefix_sumofarray(int num[]) {
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[num.length];
//         int currsum = 0;

//         // Initialize the prefix array
//         prefix[0] = num[0];
//         for (int i = 1; i < num.length; i++) {  // Start from index 1, not 0
//             prefix[i] = prefix[i - 1] + num[i];
//         }

//         // Find the maximum sum of subarray
//         for (int i = 0; i < num.length; i++) {
//             for (int j = i; j < num.length; j++) {
//                 int start = i;
//                 int end = j;

//                 // Calculate current sum using the prefix sum array
//                 currsum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

//                 // Update maxSum if the current sum is greater
//                 if (maxSum < currsum) {
//                     maxSum = currsum;
//                 }
//             }
//         }

//         // Output the maximum sum
//         System.out.println("maxsum " + maxSum);
//     }

//     public static void main(String args[]) {
//         int num[] = {1, 2, 3, 6, 5, 4, 9};
//         prefix_sumofarray(num);
//     }
// }

//                                     maxsumof sub array by kadans algorithm


// public class array2 {

    // public static void prefix_sumofarray(int num[]) {
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[num.length];
    //     int currsum = 0;

    //     // Initialize the prefix array
    //     prefix[0] = num[0];
    //     for (int i = 1; i < num.length; i++) {  // Start from index 1, not 0
    //         prefix[i] = prefix[i - 1] + num[i];
    //     }

    //     // Find the maximum sum of subarray
    //     for (int i = 0; i < num.length; i++) {
    //         for (int j = i; j < num.length; j++) {
    //             int start = i;
    //             int end = j;

    //             // Calculate current sum using the prefix sum array
    //             currsum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

    //             // Update maxSum if the current sum is greater
    //             if (maxSum < currsum) {
    //                 maxSum = currsum;
    //             }
    //         }
    //     }

    //     // Output the maximum sum
    //     System.out.println("maxsum " + maxSum);
    // }

//     public static void kadanes(int num[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<num.length; i++){
//             cs =cs + num[i];
//             if(cs<0){
//                 cs= 0;
//             }
//             ms =Math.max(cs,ms);
//         }
//         System.out.println("max subarray sum is " + ms);

//     }
//     public static void main(String args[]) {
//         int num[] = {-2,-3,4,-1,-2,1,5,-3};
//         kadanes(num);
//     }
// }

//                                 tarapping rainwater
public class array2{
    public static int trapped_water(int height[]){
        int n = height.length;
        //calcuulaate left max boundry -array
        int leftmax[] =new int[n];
        leftmax[0]=height[0];
        for(int i = 1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate the right max boundry-aarry
        int rightmax[] = new int[n];
        leftmax[n - 1] = height[n- 1];
        for(int i=n-2 ; i>=0; i--){

            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        //loop
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.max(height[i],rightmax[i+1]);
            trappedwater +=waterlevel -height[i];

        }
        return trappedwater;
        //waterlevel =min(leftbound - rightbound)
        //trapped water =waterlevel - height
    }
    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println((trapped_water(height)));
    }
}