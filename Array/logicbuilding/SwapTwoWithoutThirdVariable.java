package logicbuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapTwoWithoutThirdVariable {
    static List<Integer> get(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }
    public static void main(String[] args) {
        System.out.println("enter a and b value ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Swapped numbers : "+get(a,b));
    }
}
