package logicbuilding;

import java.util.Scanner;

public class SumOfDigits {
    static int sumofdigits(int n){
        int sum =0;
        while(n !=0){
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter n value ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Sum of digits is : "+sumofdigits(n));
    }
}
