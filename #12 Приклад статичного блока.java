package com.company;

public class StaticBlock {
    static double rootOf9; // корінь з 9
    static double rootOf27; // корінь з 27
    int number;

    static  {
        System.out.println("Ініціалізація статичних членів класу....");

        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    } // static block

    StaticBlock(int number) {
        System.out.println("Ініціалізація перемінних екземпляра класа....");

        this.number = number;
    }
} // StaticBlock class

class StaticBlockDemo {
    public static void main(String[] args) {

        System.out.println("Корінь з 9 = " + StaticBlock.rootOf9);
        System.out.println("Корінь з 27 = " + StaticBlock.rootOf27);

        StaticBlock sb1 = new StaticBlock(4);
        System.out.println("sb1.number = " + sb1.number);

        StaticBlock sb2 = new StaticBlock(16);
        System.out.println("sb2.number = " + sb2.number);

    } // main(String[]) method
} // StaticBlockDemo class
