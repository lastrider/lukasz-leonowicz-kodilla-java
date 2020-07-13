package com.kodilla.patterns.factory.tasks;

public abstract class TaskForm implements Task {

    String taskName;
    boolean status;

    public TaskForm(String taskName) {
        this.taskName = taskName;
        status= false;
    }

    @Override

    public String executeTask() {
        status = true;
        return "Task " + taskName + " was executed";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return status;
    }

}
