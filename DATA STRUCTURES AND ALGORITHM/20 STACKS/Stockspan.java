//STOCK SPAN

import java.util.*;
public class Stockspan {
    public static void stockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length ; i++) {
            int currPrice = stock[i];
            //cp compare with other stack prices                                  stock[s.peek()] == stack ke top ka price
            while (!s.isEmpty() && currPrice > stock[s.peek()]){ //s.peek se index nikala aur value ko chk krne access kar liya
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i+1;
            }else {
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }


    public static void main(String[] args) {
        int stocks[] = {99,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for (int i = 0; i < span.length ; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
