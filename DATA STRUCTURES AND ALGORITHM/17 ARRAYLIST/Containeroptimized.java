import java.util.*;

public class Containeroptimized {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("max water can be stored is " + storewater(height));
    }

    public static int storewater(ArrayList<Integer>height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while (lp<rp){
            //calc water
           int ht = Math.min(height.get(rp), height.get(lp));
           int width = rp - lp;
           int water = width * ht;
           maxWater = Math.max(water, maxWater);

           //update ptr
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }
        return maxWater;
    }
}
