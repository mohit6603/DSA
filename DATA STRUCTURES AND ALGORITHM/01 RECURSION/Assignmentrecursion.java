public class Assignmentrecursion {
    // QUESTION 1
//    public static void main(String[] args) {
//        int arr[] = {3,2,4,5,6,2,7,2,2};
//        int key = 2;
//        occurance(arr,key,0);
//    }
//    public static void occurance(int arr[], int key, int i) {
//        if (i == arr.length){
//            return;
//        }
//        if(arr[i] == key){
//            System.out.print(i + " ");
//        }
//        occurance(arr, key, i+1);
//    }



    // QUESTION 3
//    public static void main(String[] args) {
//        String str = "123456789";
//        strlength(str, 0 , 0);
//    }
//
//    public static void strlength(String str, int i, int count) {
//        if(i == str.length()){
//            System.out.println(count);
//            return;
//        }
//        strlength(str, i+1, count+1);
//    }

    public static void main(String[] args) {
        String str = "123456789";
        System.out.println(strlength(str));
    }
    public static int strlength(String str) {
        if(str.length() ==0 ){
            return 0;
        }
    return strlength(str.substring(1))+1;
    }
}
