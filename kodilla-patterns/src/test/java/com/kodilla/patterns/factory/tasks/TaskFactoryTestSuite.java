package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Task drivingTask = factory.makeTask(TasksFactory.DRIVING);
        assert drivingTask != null;
        boolean statusBeforeExecution = drivingTask.isTaskExecuted();
        //Then
        Assert.assertFalse( statusBeforeExecution);
        Assert.assertEquals("DrivingTask1", drivingTask.getTaskName());
        Assert.assertEquals("Task DrivingTask1 was executed", drivingTask.executeTask());
        Assert.assertTrue(drivingTask.isTaskExecuted());

    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Task paintingTask = factory.makeTask(TasksFactory.PAINTING);
        assert paintingTask != null;
        boolean statusBeforeExecution = paintingTask.isTaskExecuted();
        //Then
        Assert.assertFalse( statusBeforeExecution);
        Assert.assertEquals("PaintingTask1", paintingTask.getTaskName());
        Assert.assertEquals("Task PaintingTask1 was executed", paintingTask.executeTask());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Task shoppingTask = factory.makeTask(TasksFactory.SHOPPING);
        assert shoppingTask != null;
        boolean statusBeforeExecution = shoppingTask.isTaskExecuted();
        //Then
        Assert.assertFalse(statusBeforeExecution);
        Assert.assertEquals("ShoppingTask1", shoppingTask.getTaskName());
        Assert.assertEquals("Task ShoppingTask1 was executed", shoppingTask.executeTask());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
}
