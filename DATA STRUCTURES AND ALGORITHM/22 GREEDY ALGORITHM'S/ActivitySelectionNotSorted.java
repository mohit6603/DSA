//UNSORTED END TIME
//SORTING OF 2D ARRAY

import java.util.*;
public class ActivitySelectionNotSorted {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sorting
        int activites[][] = new int [start.length][3];
        for (int i = 0; i < start.length; i++) {
            activites[i][0] = i;  //index storing
            activites[i][1] = start[i]; //start storing
            activites[i][2] = end[i]; //end storing

            //above steps are performed to store orignal index so that after sorting it doesnt affect
        }
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(activites[0][0]);
        int lastEnd = activites[0][2];
        for (int i = 0; i <end.length ; i++) {
            if(activites[i][1] >= lastEnd){  //[i][1] start time
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
        }

        System.out.println("maxAct is " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
