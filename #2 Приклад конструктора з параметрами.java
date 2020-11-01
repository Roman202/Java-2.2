package com.company;

public class Number {
    int x;
    Number(int num) {
        x = num;
    } // Number(int) constructor
} // Number class

class NumberDemo {

    public static void main(String[] args) {

        Number t1 = new Number(9);
        Number t2 = new Number(27);

        System.out.println(t1.x + " *** " + t2.x);
    } //main(String[]) method
} // NumberDemo class
