 //activity selection pronblem
import java.util.*;
public class greedyapproach {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
    //Endtime time should be in sorted order
        int maxact = 0;
        int act = 0;

    //first acitivity always selected
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        maxact = 1;

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= end[act]) {
                maxact++;
                ans.add(i);
                act = i;
            }
        }   

        System.out.println("Maximum activities = " + maxact);
        System.out.println("A" + ans +" ");
    }
}
