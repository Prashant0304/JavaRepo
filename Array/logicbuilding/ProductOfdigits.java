package logicbuilding;

import java.util.Scanner;

public class ProductOfdigits {
    static int productofdigits(int n){
        int product = 1;
        while(n !=0){
            int digit = n%10;
            product = product *digit;
            n = n/10;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println("Enter n value ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Product of digits :"+productofdigits(n));
    }
}
