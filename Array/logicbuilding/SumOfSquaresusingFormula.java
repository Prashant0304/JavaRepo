package logicbuilding;

import java.util.Scanner;

public class SumOfSquaresusingFormula {
    static int findSumOfSquares(int n){
        int sum = (n*(n+1)*(2*n+1))/6;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter n values");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Sum of squares is : "+findSumOfSquares(n));
    }
}
