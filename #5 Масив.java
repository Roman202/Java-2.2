package com.company;

public class Main {

    public static void main(String[] args) {
	    int array[][] = new int[7][8];
	    int i, count;
	    // Цикл для першої розмірності масива
	    for(count = 0; count < 8; count++) {
	        i = 0;
	        // Цикл для другої розмірності масива
	        while (i < 8) {
	        	// Присвоєння значення розмірності масива
	            array[count] [i] = i;
	            System.out.print("array[" + count + "][" + i + "] = " + i + " ");

	            i++;
            }
	        System.out.println();
        }
    }
}
