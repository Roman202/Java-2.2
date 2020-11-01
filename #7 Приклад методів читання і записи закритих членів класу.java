package com.company;

public class Vehicle {
    int passengers; //Кількість пасажирів
    private int wheels; // Число коліс
    private int maxspeed; // Максимальна швидкість
    int burnup; // Розхіж палива

    // Конструктор класа Vehicle
    Vehicle(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }  // Vehicle(int, int, int, int) constructor

    //Розрахунок пройденого шляху
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    } // distance(double) method

    //метод читання значення maxspeed
    int getMaxspeed() {
        return this.maxspeed;
    }

    //метод читання значення кількості колес
    int getWheels() {
        return this.wheels;
    }

    // метод запису кількості колес
    void setWheels(int wheels) {
        // Перевіряємо переданий параметр на коректність
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Неправильно вказано кількість колес. ");
            return;
        }
        this.wheels = wheels;
    }
} //Vehicle class

class VehicleGetSetMethod {

    public static void main(String[] args) {

        Vehicle ferrari = new Vehicle(2,-2, 360, 12);
        System.out.println("Max speed: " + ferrari.getMaxspeed() + " km/h. ");
        System.out.println("Sum wheels: " + ferrari.getWheels());

        ferrari.setWheels(4);
        System.out.println("Sum wheels (return): " + ferrari.getWheels());
    }
}