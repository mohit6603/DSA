//inplementation of QUEUES by array TC = 0(N)

import java.util.*;
public class Queues {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;


        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;           //if queue is emty will return -1 else not empty
        }

        //add 0(1)
        public static void add(int data){
            if(rear == size-1){  //rear last index tak pouch gya hai
                System.out.println("Queue is full");
                return;
            }
            rear = rear+1;
            arr[rear] = data; //arr[rear] is initilize with data
        }

        //remove 0(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i <rear ; i++) {
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        //peek 0(1)
        public static int peek() {
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5); //arr size
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        //add = 1 2 3 4

        //FIFO fashion me aa jayange
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        //remove = 1 2 3 4
    }
}
//stack me order opposite ho jata