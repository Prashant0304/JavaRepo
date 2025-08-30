package logicbuilding;

import java.util.Scanner;

public class MultiplicationTable {

    static void multiplication(int a){
        for(int i =1;i<=10;i++){
            System.out.println(a+ "*" +i +"=" +a*i );
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter table number to start ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        multiplication(n);
    }
}
