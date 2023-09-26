public class mk {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 8, 7};
        swap(arr);
        print(arr);
    }
    public static void swap(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean isswap = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isswap = true;
                }
            }
            if(isswap == false){
                break;
            }
        }
    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
