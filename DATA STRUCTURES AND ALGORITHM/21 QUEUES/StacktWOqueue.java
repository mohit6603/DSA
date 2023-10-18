//stack using 2 queues

import java.util.*;
public class StacktWOqueue {
    static class Stack{
        static Queue <Integer> q1 = new LinkedList<>();
        static Queue <Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();  //isme dono ko chk krne ki grj h hame nhi pata permanently kisme stored hai elements
        }

        public static void push(int data){ //non empty queue me elements ko add kar do
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;

            if(!q1.isEmpty()){   //jab elem q1 me hai jab tak khali nhi hota pop krdo
                while (!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{ //q2 me sare elem. hai
                while (!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;

            if(!q1.isEmpty()){   //jab elem q1 me hai jab tak khali nhi hota pop krdo
                while (!q1.isEmpty()){
                    top = q1.remove();
//                    if(q1.isEmpty()){
//                        break;
//                    }
                    q2.add(top);
                }
            }else{ //q2 me sare elem. hai
                while (!q2.isEmpty()){
                    top = q2.remove();
//                    if(q2.isEmpty()){
//                        break;
//                    }
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
