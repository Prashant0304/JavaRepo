package BinarySearch;

public class Recursive {

    static int binarySearch(int[] arr,int low, int high, int k){
        if(high >= low){
            int mid = (low+high)/2;
            if(arr[mid] == k)
                return mid;
            if(arr[mid] > k)
                return binarySearch(arr,low,mid-1,k);
            return binarySearch(arr,mid+1,high,k);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        int k=7, n=arr.length-1;
        int val=binarySearch(arr,0,n,k);
        if(val == -1)
            System.out.println("The Element is not present");
        else
            System.out.println("The element is present at : "+val);
        }
}

