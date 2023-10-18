// MAXIMUM LENGTH CHAIN PAIR

import java.util.*;
public class MaxLengthChainPair {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); //2nd no ke basis par sorting kar di hai
        int chainLength = 1; //first pair ko pick kar liya hai isliyea ye 1 se initilize hua hai
        int lastPair2ndNum = pairs[0][1]; //ab tak jo chain form hui uska end

        for (int i = 1; i < pairs.length; i++) {
            if(pairs[i][0] > lastPair2ndNum){
                chainLength++;
                lastPair2ndNum = pairs[i][1];
            }
        }
        System.out.println("max length of chain : " + chainLength);
    }
}
//0(nlogn)