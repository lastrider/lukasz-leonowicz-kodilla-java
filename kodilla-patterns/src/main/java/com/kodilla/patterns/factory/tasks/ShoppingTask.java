package com.kodilla.patterns.factory.tasks;

public class ShoppingTask extends TaskForm {

    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        super(taskName);
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
}
