package com.kodilla.Module_1.Task_6_HashCode;

class Rectangle {

}

public class Application
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Rectangle rectangle = new Rectangle();
        int number = rectangle.hashCode();

        System.out.println(number);

    }
}