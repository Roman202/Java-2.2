package com.company;

public class Basket { // "корзина покупок"

    // оплата готівкою
    void pay(double money) {
        System.out.println("Оплачено готівкою: " + money);
    }

    // оплата кредитними картками
    void pay(String cardNum) {
        System.out.println("Оплачено по кредитній карті #" + cardNum);
    }

    // оплата чеком
    void pay(String accountNum, String bankCode) {
        System.out.println("Перевід на рахунок #" + accountNum + " в банк " + bankCode);
    }
} // Basket class

class BasketDemo {

    public static void main(String[] args) {

        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();

        System.out.print("b1: ");
        b1.pay(1200.0); //Оплата готівкою
        System.out.print("b2: ");
        b2.pay("123456789"); //Оплата кридитною карткою
        System.out.print("b3: ");
        b3.pay("987654321","5500"); //Оплата готівкою
    }
}