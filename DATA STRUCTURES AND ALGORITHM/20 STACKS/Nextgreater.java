// NEXT GREATER ELEMENT  0(n)   right side me nikalo

import java.util.*;
public class Nextgreater {

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGrtr[] = new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            //while loop chk
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //if else chk
            if(s.isEmpty()){
                nxtGrtr[i] = -1;
            }else {
                nxtGrtr[i] = arr[s.peek()];
            }
            //push in s
            s.push(i); //index ko push kr rhe hai
        }

        for (int i = 0; i < nxtGrtr.length ; i++) {
            System.out.print(nxtGrtr[i] + " ");
        }
        System.out.println();
    }
}

//right side me nikalo
//left side me nikalo  for loop ko ulta kaar do
//next smallest in right   chote element ko hatane ki jagha bade ko hata do >=
//next smaller left for and >= dono change