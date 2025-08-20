package BinarySearch;

public class Iterative {

    static int binarySearch(int[] arr,int k){
        int low=0,high=arr.length-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid] == k)
                return mid;
            if(arr[mid] < k)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9}, k=7;
        int val = binarySearch(arr,k);
        if(val == -1)
            System.out.println("the Value is not present in the array");
        else
            System.out.println("The value is present at : "+val);
    }
}
