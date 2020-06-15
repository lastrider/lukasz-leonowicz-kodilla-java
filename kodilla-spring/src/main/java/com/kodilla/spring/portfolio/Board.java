package com.kodilla.spring.portfolio;

public class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToToDoList(String task) {
        toDoList.addTask(task);
    }
    public void addTaskToInProgressList(String task) {
        inProgressList.addTask(task);
    }
    public void addTaskToDoneList(String task) {
        doneList.addTask(task);
    }

    public void display() {
        System.out.println("Tasks assigned to to-do list: " + String.join(" / ", toDoList.getTasks()));
        System.out.println("Tasks assigned to in progress list: " + String.join(" / ", inProgressList.getTasks()));
        System.out.println("Tasks assigned to done list: " + String.join(" / ", doneList.getTasks()));
    }
}
