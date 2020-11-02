package com.company;

public class Factorial {

    // Вичислення факторіала в циклі
    static long computeI(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    // Вичеслення факторіала рекурсивним способом
    static  long computeR(int n) {
        if (n == 1) return n;
        return computeR(n - 1) * n;
    }
} // Factorial class

class FactorialDemo {

    public static void main(String[] args) {

        //Factorial f = new Factorial();
        System.out.println("Вичислення факторіала в циклі: ");
        for (int i = 6; i > 0; i--) {
            System.out.println(i + "! = " + Factorial.computeI(i));
        }
        System.out.println("Вичислення факторіала рекурсивним методом:");
        for (int r = 1; r <= 6; r++) {
            System.out.println(r + "! = " + Factorial.computeR(r));
        }
    }
}
