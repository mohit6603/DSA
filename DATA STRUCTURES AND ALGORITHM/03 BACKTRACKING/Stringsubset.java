public class Stringsubset {
    public static void main(String[] args) {
        String str = "abc";
        substr(str, "", 0);
    }
    public static void substr(String str, String ans, int i){
        //base
        if(i == str.length()){
            if(ans.length()==0){   //if a string is empty then its length will be 0
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }
        //yes choice
        substr(str, ans+str.charAt(i),i+1);
        //no choice
        substr(str, ans , i+1);
    }
}
