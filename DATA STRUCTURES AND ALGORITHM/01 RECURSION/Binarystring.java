public class Binarystring {
    public static void main(String[] args) {
        int lastplace;
        binstr(3,0," ");
    }

    public static void binstr(int n,int lastplace ,String str) {
        //base
        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam
//        if(lastplace ==0){
//            binstr(n-1,0,str+="0");
//            binstr(n-1,0,str+="1");
//        }else {
//            binstr(n-1,1,str+="0");
//        }

        binstr(n-1,0,str+"0");
        if (lastplace == 0) {
            binstr(n-1,1,str+"1");
        }
    }
}
