public class Mergesort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};
        mergesort(arr,0, arr.length-1);
        printarr(arr);
    }
    public static void mergesort(int arr[], int si, int ei) {
        //base
        if(si>=ei){
            return;
        }
        //kaam
        int mid = si +(ei-si)/2; //(si+ei)/2
        mergesort(arr,si,mid); //left calc
        mergesort(arr,mid+1,ei); //right calc

        merge(arr,si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        //create temp arr  left(0,3)=4   right(4,6)=3 -> 6-0+1 = 7  7required hai
        int temp[] = new int [ei-si +1];
        int i = si; //iterator for left
        int j = mid+1; //iterator for right
        int k = 0; //iterator for temp[]

        while (i<= mid && j<= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;k++;
            }else {
                temp[k] = arr[j];
                j++;k++;
            }
            //k++;
        }
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        while (j<=ei){
            temp[k++] = arr[j++];
        }
        for (k=0, i=si; k < temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void printarr(int arr[]) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
