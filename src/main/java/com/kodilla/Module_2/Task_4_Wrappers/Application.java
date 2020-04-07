package com.kodilla.Module_2.Task_4_Wrappers;

public class Application {

    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();

        wrapper.areIntegerTypesEqual(25, 25);
        wrapper.areBooleanTypesEqual(false, false);
        wrapper.areDoubleTypesEqual(2.9,2.9);
    }
}

class Wrapper {

    void areIntegerTypesEqual(Integer oNumber, int number) {
        System.out.println(oNumber == number);
    }

    void areBooleanTypesEqual(Boolean oBoolean, boolean pBoolean) {
        System.out.println(oBoolean == pBoolean);
    }

    void areDoubleTypesEqual(Double oDouble, double pDouble) {
        System.out.println(oDouble == pDouble);
    }
}
