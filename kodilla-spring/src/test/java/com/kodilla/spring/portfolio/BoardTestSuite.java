package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        //When
        Board board = context.getBean(Board.class);
        board.addTaskToDoneList("Task 1");
        board.addTaskToDoneList("Task 2");
        board.addTaskToInProgressList("Task 3");
        board.addTaskToToDoList("Task 4");
        //Then
        board.display();
    }
}
