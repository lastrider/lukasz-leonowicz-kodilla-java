package com.kodilla.ExtraTasks.BinToDec;

public class Application {
    public static void main(String[] args) {
        int binNumber = 10111000;
        new BinToDec().swap(binNumber);
    }
}

class BinToDec {

    public void swap(Integer binNumber) {
        int exponent = 0;
        int intNumber = 0;

        while (binNumber != 0) {
            int digit = binNumber % 10;

            if (digit != 1 && digit != 0) {
                System.out.println("Number is not binary");
                System.exit(0);
            }

            intNumber += digit * (int) Math.pow(2.0, exponent++);
            binNumber /= 10;
        }

        System.out.println("Decimal number is: " + intNumber);
    }
}