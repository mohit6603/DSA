//STACK USING DEQUE

import java.util.*;
public class stackusingdeque {
    public static class Stack{
        Deque<Integer> d = new LinkedList<>(); //no use of stack deque ka use krke push pop peek perform

        public void push(int data){
            d.addLast(data);
        }

        public int pop(){
            return d.removeLast();
        }

        public int peek(){
            return d.getLast();
        }
    }

    public static void main(String[] args) {
//        Stack<Integer> s = new Stack();  JCF wala stack hai
        Stack s = new Stack();  //ye stack class ko implement krke use hone wala stack hai
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek()); //top elemt denga
        System.out.println(s.pop()); //top element remove honga
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
