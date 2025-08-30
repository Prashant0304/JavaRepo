package SumOfPairs;

public class Iterartive {
    static boolean sumofpairs(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              if( arr[i]+arr[j]==target)
                  return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5,6,7};
        int target=4;
        boolean value = sumofpairs(arr,target);
        if(value == true) {
            System.out.println(value);
        }else {
            System.out.println(value);
        }

    }
}
