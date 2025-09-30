 //activity selection pronblem
// import java.util.*;
// public class greedyapproach {
//     public static void main(String[] args) {
//         int start[] = {1, 3, 0, 5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};
//         // sorting
//         // based on end time
//         int activities[][] = new int[start.length][3];
//         for (int i = 0; i < start.length; i++) {
//             activities[i][0] = i; // activity number
//             activities[i][1] = start[i]; // start time
//             activities[i][2] = end[i]; // end time
//         }

//         //lamda function
//         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


//         // if end time is same then sort based on start time
//     //Endtime time should be in sorted order
//         int maxact = 0;
//         int act = 0;

//     //first acitivity always selected
//         ArrayList<Integer> ans = new ArrayList<>();
//         ans.add(activities[0][0]);
//         maxact = 1;

//         for (int i = 1; i < end.length; i++) {
//             if (activities[i][1]>= end[act]) {
//                 maxact++;
//                 ans.add(activities[i][0]);
//                 act = i;
//             }
//         }   
//         System.out.println("Maximum activities = " + maxact);
//         System.out.println("A" + ans +" ");
//     }
// }


//fractional knapsack problem
import java.util.*;
public class greedyapproach{
    public static void main(String[] args){
        int val[] = {60,100,120};
        int wt[] = {10,20,30};
        int cap = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col = index and 1st col = ratio of array to track elementspostion after sorting
        for(int i =0 ; i< val.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }
        //sorting based on ratio
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity = cap;
        int finalval = 0;
        for(int i =ratio.length-1;i >=0 ;i--){
            int idx = (int)ratio[i][0];
            if(wt[idx] <= capacity){
                finalval += val[idx];
                capacity -= wt[idx];
            }else{
                // include fractiona, if wt is more than capacity
                finalval += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value in knapsack = " + finalval);
    }
}