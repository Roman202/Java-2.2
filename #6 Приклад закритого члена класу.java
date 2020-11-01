package com.company;

public class Vehicle {
    int passengers; //Кількість пасажирів
    int wheels; // Число коліс
    private int maxspeed; // Максимальна швидкість
    int burnup; // Розхіж палива

    // Конструктор класа Vehicle
    Vehicle(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // Vehicle(int, int, int, int) constructor

    //Розрахунок пройденого шляху
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    } // distance(double) method
} //Vehicle class

class VehicleAccessDemo {
    public static void main(String[] args) {
        Vehicle ferrari = new Vehicle(2, 4, 360, 12);

        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari за пів години проїде " + distance + " км. ");

        // Наступна команда викличе помилку компіляції.
        // Закоментуйте її
        //System.out.println("Швидкість Ferrari: " + ferrari.maxspeed + " km/h");
    }
}
