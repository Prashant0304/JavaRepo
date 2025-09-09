package logicbuilding;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void sumofnaturals(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum= sum+i;
        }
        System.out.println("The sum of natural numbers is :"+sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to find sum of Natural numbers");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        sumofnaturals(number);
    }
}
