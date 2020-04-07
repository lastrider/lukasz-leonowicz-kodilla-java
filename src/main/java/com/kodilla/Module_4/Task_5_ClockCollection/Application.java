package com.kodilla.Module_4.Task_5_ClockCollection;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        Clock clock2 = new Clock("11:22:12");
        Clock clock3 = new Clock("12:41:05");
        Clock clock4 = new Clock("22:23:56");
        Clock clock5 = new Clock("06:21:24");

        List<Clock> list = new LinkedList<>();

        list.add(clock1);
        list.add(clock2);
        list.add(clock3);
        list.add(clock4);
        list.add(clock5);

        for (Clock clock : list) {
            System.out.println(clock);
            clock.addHoursAndMinutes(1, 1);
            System.out.println(clock);
            System.out.println();
        }
    }
}


class Clock {
    private LocalTime time;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Clock() {
        this.time = LocalTime.now();
    }

    public Clock(String time) {
        this.time = LocalTime.parse(time);
    }

    public String getTime() {
        return time.format(formatter);
    }

    public void addHoursAndMinutes(int amountOfHours, int amountOfMinutes) {
        time = time.plusHours(amountOfHours);
        time = time.plusMinutes(amountOfMinutes);
    }

    public String toString(){
        return time.format(formatter);
    }
}