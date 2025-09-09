package logicbuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapTwo {
    static List<Integer> get(int a, int b){
        int temp= a;
        a = b;
        b = temp;
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }
    public static void main(String[] args) {
        System.out.println("Enter a and b values");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<Integer> c=get(a,b);
        System.out.println(c);
    }
}
