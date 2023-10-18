public class Queueiincircular {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;  //rear ko age badhana chahate ho par age me front baitha hai
        }

        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){ //1st element add conditon
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];  //front ko store krwa rhe result variable me
//            front = (front+1)%size;

            if(rear == front){ //if we delete last element of queue
                rear= front = -1;
            }else {
                front = (front+1)%size;
            }
            return result;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        //circular operations
        System.out.println(q.remove()); //front remove hora hai
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        //1 2 3
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
