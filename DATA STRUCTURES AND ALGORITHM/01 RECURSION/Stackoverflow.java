public class Stackoverflow {
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }

    public static void printDec(int n) {
        //base case
//        if (n == 1) {
//            System.out.print(n);
//            return;
//        }

        //kaam print ka
        System.out.print(n + " ");

        //inner function calling
        printDec(n-1);
    }
}

//base case ko comment out krdoo stackoverflow ho jayenga