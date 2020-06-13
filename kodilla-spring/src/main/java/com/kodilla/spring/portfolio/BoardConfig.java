package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDo(), getInProgress(), getDone());
    }

    @Bean(name = "toDo")
    public TaskList getToDo() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    public TaskList getInProgress() {
        return new TaskList();
    }

    @Bean(name = "done")
    public TaskList getDone() {
        return new TaskList();
    }
}