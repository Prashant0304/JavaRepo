package logicbuilding;

import java.util.Scanner;

public class CheckOddOrEven {
    static boolean oddoreven(int a){
        if((a %2) == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = oddoreven(n);
        System.out.println("The given value is odd : "+b);
    }
}
