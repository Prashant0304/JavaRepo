package logicbuilding;

import java.util.Scanner;

public class SumofNaturalNumbersRecursive {
    static int findSum(int n){
        if(n==1)
            return 1;
        return n + findSum(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter n value");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println("Sum of Natural number is : "+findSum(n));
    }
}
