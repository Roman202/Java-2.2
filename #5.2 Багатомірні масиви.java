package com.company;

public class Main {

    public static void main(String[] args) {
        char[][] array = new char[3][4];
        for (int i = 0; i < array.length; i++)
            array[i] = new char[3];
        array[0][0] = 'C';
        System.out.print(array[0][0]);
    }
}
