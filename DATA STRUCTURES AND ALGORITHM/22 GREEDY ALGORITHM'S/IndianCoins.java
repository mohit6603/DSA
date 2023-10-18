
import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder()); //int type raha tab ap reverseorder ko call nahi kr skte

        int count = 0;
        int val = 1059;
        ArrayList<Integer> coinsused = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if(coins[i] <= val){
                while (coins[i] <= val){
                    count++;
                    coinsused.add(coins[i]);
                    val -= coins[i];
                }
            }
        }
        System.out.print(count + "(" + coinsused +")");
    }
}
//tc = 0()