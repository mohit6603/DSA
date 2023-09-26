public class Quicksort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5,-5};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
    public static void quicksort(int arr[], int si, int ei){
        //base
        if(si >= ei){
            return;
        }
        //pivot find == last element
        int pvtindx = partition(arr,si,ei);
        quicksort(arr, si, pvtindx-1); //left part
        quicksort(arr,pvtindx+1, ei); //right part
    }
    public static int partition(int arr[], int si, int ei) {
        //pivot
        int pivot = arr[ei];
        int i = si-1; //to make place for els smaller pivot

        for (int j = si; j < ei; j++) {
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //pivot ko sahi jagh par dalne ke liye
        i++;
        //swap
        int temp = pivot;
        arr[ei] = arr[i];    //pivot = arr[i] mat likhna  pivot varible hai tumhe index value chaiyea
        arr[i] = temp;
        return i; //i abb pivot ka sahi updated index hai as pivot ko arr[i] me store kiya hai
    }
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
