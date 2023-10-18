//HEIGHT OF HISTOGRAM

import java.util.*;
public class Heightofhistogram {
    public static void maxArea(int arr[]) {
        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right  0(n)
        Stack<Integer> sr = new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--){
            while (!sr.isEmpty() && arr[sr.peek()] >= arr[i]){
                sr.pop();
            }
            if (sr.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = sr.peek();
            }
            sr.push(i);
        }

        //next smaller left 0(n)
        sr = new Stack<>();  //stack khali hnga
        for (int i = 0; i < arr.length ; i++){
            while (!sr.isEmpty() && arr[sr.peek()] >= arr[i]){
                sr.pop();
            }
            if (sr.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = sr.peek();
            }
            sr.push(i);
        }

        //current area 0(n)
        for (int i = 0; i < arr.length ; i++) {
            int width = nsr[i] - nsl[i] -1;
            int height = arr[i];
            int currArea = height * width;
            maxarea = Math.max(currArea, maxarea);
        }

        System.out.println(maxarea);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};//height
        maxArea(arr);
    }
}
