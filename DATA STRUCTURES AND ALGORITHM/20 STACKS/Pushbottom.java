//PUSH AT THE BOTTOM OF STACK

import java.util.*;
public class Pushbottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop(); //top store
        pushAtBottom(s,data); //call for inner level
        s.push(top); //refill remove values
    }
}
