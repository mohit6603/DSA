//implementation of stack using arraylist

import java.util.ArrayList;

public class StackB {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        //isEmpty
        public static boolean isEmpty(){
            return list.size() ==0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty() == true){ //when stack is empty
                return -1;
            }
            int top = list.get(list.size()-1); //store top
            list.remove(list.size()-1); //remove top
            return top; //retun removed value
        }

        //peek
        public static int peek(){ //here we dont remove top
            int top = list.get(list.size()-1); //store top
            return top;
        }
    }


    public static void main(String[] args) {
        Stack s = new Stack();
//        s.push(1);
//        s.push(2);s.push(3);s.push(4);

        while (!s.isEmpty()){  //stmnt jb tk true nhi hoti tab tak chelenga
            System.out.println(s.peek());
            s.pop();
        }
    }
}
