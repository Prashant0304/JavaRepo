import java.util.*;

public class reverseArrayFour {

    static void reverseArray(List<Integer> arr){
        Collections.reverse(arr);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5,8,6,4));
        reverseArray(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
