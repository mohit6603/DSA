public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(issorted(arr, 0));
    }

    public static boolean issorted(int arr[] , int i) {
            //base
            if (i == arr.length-1) {
                return true;
            }

            //initial stopping condn.
            if(arr[i] > arr[i+1]){
                return false;
            }

            //recursive call
            return  issorted(arr , i+1 );
    }
}
