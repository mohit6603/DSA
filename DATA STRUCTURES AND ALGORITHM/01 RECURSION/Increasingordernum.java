public class Increasingordernum {
    public static void main(String[] args) {
        int n = 1;
        printInc(n);
    }

    public static void printInc(int n) {
        //base case
        if (n == 10) {
            System.out.print(n);
            return;
        }

        //kaam
        System.out.print(n + " ");

        //inner function calling
        printInc(n+1);
    }
}
