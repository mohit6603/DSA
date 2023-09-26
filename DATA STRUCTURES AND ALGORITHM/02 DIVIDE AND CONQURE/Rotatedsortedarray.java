public class Rotatedsortedarray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 10 ;
        int targetidx = targetsearch(arr, target, 0, arr.length-1);
        System.out.println(targetidx);
    }
    public static int targetsearch(int arr[], int target, int si, int ei){
        //base
        if(si > ei){
            return -1;     //invalid condn.
        }
        //kaam
        int mid = si + (ei-si)/2;

        //case found
        if(arr[mid] == target){
            return mid;
        }

        //mid lie on l1
        if(arr[si] <= arr[mid]){
            //case a left of l1
            if(arr[si] <= target && target <= arr[mid]){
                return targetsearch(arr, target, si, mid-1); //mid-1 bhi crct hnga kyuki mid par nhi mili vlue tb vo idhr aya
            }else {
                return targetsearch(arr, target, mid+1, ei);
            }
        }
        //mid lie on l2
        else {
            //case c right of l2
            if(arr[mid]<= target && target <= arr[ei]){
                return targetsearch(arr, target, mid+1, ei);
            }
            //case d left of l2
            else{
                return targetsearch(arr, target, si, mid-1);
            }

        }
    }
}
