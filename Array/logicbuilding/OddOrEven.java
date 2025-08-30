package logicbuilding;

import java.util.Scanner;

public class OddOrEven {
    static boolean oddoreven(int a){
        if((a&1)==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.print("Enter n value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b=oddoreven(n);
        System.out.println("The given value is even : "+b);
    }
}
