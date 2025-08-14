public class ReverseTwo {
    public static void main(String[] args) {
        int arr[] ={9,6,5,9,3,6,7,9};
        int n= arr.length;
        int temp[] = new int[n];

        for(int i=0;i<n;i++){
            temp[i] = arr[n-i-1];
        }

        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
