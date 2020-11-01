package com.company;

public class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    // Конструктор з параметрами
    Vehicle(int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed = ms;
        burnup = bu;
    } // Vehicle(int, int, int, int)

    // Розрахунок довжини пройденого шляху
    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    } // distance(double)
} // Vehicle class

class VehicleConstrDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(2, 4, 130, 30);
        Vehicle bus = new Vehicle(45, 4, 120, 25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("Автомобіль з " + car.passengers + " пасажирами " + "пройде за 1 годину " + distanceCar + " км. ");

        System.out.println("Автобус з " + bus.passengers + " пасажирами " + "пройде за 1 годину " + distanceBus + " км. ");

        } // main(String[]) method
    } // VehicleConstrDemo class

