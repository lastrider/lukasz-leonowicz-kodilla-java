package com.kodilla.Module_3.Task_3_IteratorAndWhileLoop;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 0;

        Random random = new Random();
        int counter=1;

        while (sumaA > sumaB) {
            sumaA -= random.nextInt(10);
            sumaB += random.nextInt(50);

            System.out.print("Przebieg: ");
            System.out.printf("%02d", counter++) ;
            System.out.print (" \\ SumaA: ");
            System.out.printf("%03d", sumaA);
            System.out.print( " \\ SumaB: ");
            System.out.printf("%03d",sumaB);
            System.out.println();
        }
    }
}
