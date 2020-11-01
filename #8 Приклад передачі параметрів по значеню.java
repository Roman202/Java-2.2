package com.company;

public class ParaByValue {
    void callByVal(int x, int y) {
        x = x + y;
        y = y + 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    } // callByVal(int, int) method
} // ParaByValue class

class ParaByValueDemo {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        // передача параметрів по значеню

        ParaByValue test = new ParaByValue();
        test.callByVal(a, b);

        System.out.println("a = " + a); // Вивід 2
        System.out.println("b = " + b); // Вивід 3
    }
}
