import java.util.Scanner;

//Given an array, arr[] of n integers, and an integer element x,
// find whether element x is present in the array. Return the index of the first occurrence of x in the array,
// or -1 if it doesn't exist.
public class LinearSearch {
    static int linearsearch(int arr[], int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,8,14};
        System.out.print("Provide Integer value : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int value=linearsearch(arr,x);
        if(value == -1){
            System.out.println("X is not present "+value);
        }else{
            System.out.println("X is present at : "+value);
        }
    }
}
