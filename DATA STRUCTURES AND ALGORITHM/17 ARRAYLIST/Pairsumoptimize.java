import java.util.*;
public class Pairsumoptimize {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //sorted list hai
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 50;
        System.out.println(sum(list, target));
    }

    //TC = 0(n) liner tc
    public static boolean sum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;

        while (lp<rp){     //lp!=rp
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }else {          //  get lp +get rp > target
                rp--;
            }
        }
        return false;
    }
}
