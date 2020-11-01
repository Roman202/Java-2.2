package com.company;

public class ParaByRef {
    int x, y;

    ParaByRef(int x, int y) {
        this.x = x;
        this.y = y;
    } // Конструктор ParaByRef

    // Передача об'єкта (По посиланню)
    void callByRef(ParaByRef o) {
        o.x = o.x + this.x; //Читання змінної х
        o.y = o.y + this.y; //Читання змінної у
    } // callByRef(ParaByRef) method
} //ParaByRef class

class ParaByRefDemo {

    public static void main(String[] args) {
        ParaByRef p = new ParaByRef(2, 3); // Перший об'єкт
        ParaByRef q = new ParaByRef(3, 2); // Другий об'єкт

        System.out.println("q.x = " + q.x); // Вивід 3
        System.out.println("q.y = " + q.y); // Вивід 2

        p.callByRef(q);

        System.out.println("q.x = " + q.x); // Вивід 5
        System.out.println("q.y = " + q.y); // Вивід 5
    }
}
