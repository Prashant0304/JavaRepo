package LinearSearch;

public class SequentialMethod {
    public static void main(String[] args) {
        int arr[]={2,5,6,7,8,1}, k=8;
        int value = linearsearch(arr,k);
        if(value == -1){
            System.out.println("The value is not present");
        }else{
            System.out.println("The value is present at : "+value);
        }
    }
    static int linearsearch(int[] arr, int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
               return i;
            }
        }
        return -1;
    }
}
