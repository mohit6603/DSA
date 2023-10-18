//REVERSE STACK

import java.util.*;
public class Reversestack {
    public static void reverseStack(Stack<Integer>s) {
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s); //top ko nikalna upr jate vaqt
        pushAtBottom(s,top); // bottom par dal dena  niche jate wqt
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

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()){
            System.out.println(s.pop());
            //pop krne 123
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);
    }
}
