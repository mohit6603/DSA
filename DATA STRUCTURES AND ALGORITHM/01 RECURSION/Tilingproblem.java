public class Tilingproblem {
    public static void main(String[] args) {
        int n= 4;
        System.out.println(tilingprblm(n));  //n == floor length darshata hai
    }

    public static int tilingprblm(int n) {   //2*n floor size  &&  2*1 tile size

        //base
        if(n==0|| n==1){
            return 1;
        }
//        //kaam vertical
//        int fnm1 = tilingprblm(n-1);
//
//        //kaam horizontal
//        int fnm2 = tilingprblm(n-2);
//
//        return fnm1+fnm2;

        return tilingprblm(n-1)+tilingprblm(n-2);
    }
}