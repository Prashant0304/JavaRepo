package logicbuilding;

public class SwapTwoNumbers {
    static void swaptwo(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a :"+a +"  b :"+b);
    }

    public static void main(String[] args) {
        int a=20 , b=10;
        swaptwo(a,b);
    }
}
