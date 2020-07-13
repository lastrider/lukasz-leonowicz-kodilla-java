package com.kodilla.patterns.factory.tasks;

public class TasksFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("DrivingTask1", "France", "?");
            case PAINTING:
                return new PaintingTask("PaintingTask1", "Red", "Wall");
            case SHOPPING:
                return new ShoppingTask("ShoppingTask1", "Carrot", 10);
            default:
                return null;
        }
    }
}
