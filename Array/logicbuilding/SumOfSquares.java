package logicbuilding;

import java.util.Scanner;

public class SumOfSquares {
    static int findSquares(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + (i*i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter n value");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = findSquares(n);
        System.out.println("sum of squares is : "+b);
    }
}
