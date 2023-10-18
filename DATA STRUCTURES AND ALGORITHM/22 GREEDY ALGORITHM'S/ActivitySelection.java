//END TIME BASIS SORTED CASE

import java.util.*;
public class ActivitySelection {

    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[]   = {2,4,6,7,9,9}; //end time basis sorted activity

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity 
        maxAct = 1;
        ans.add(0); //adding 1st activity to arraylist
        int lastEnd = end[0];  //last jo activity select ki thi uska end time kya tha i.e end[0]
        for (int i = 1; i <end.length ; i++) {
            if(start[i] >= lastEnd){ // dijoint set condition
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("max activites " + maxAct);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print("A"+ans.get(i) + " ");
        }
        System.out.println();
    }
}
 //0(n)