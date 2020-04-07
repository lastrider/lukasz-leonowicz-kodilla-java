package com.kodilla.Module_3.Task_4_ForAndWhileLoopOnCollections;

import java.util.*;

class NewQueue {

    Deque<String> generate(int count, int length) {
        Deque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {
            String s = "a";
            for (int j = 0; j < (new Random().nextInt(length)); j++) {
                s += "a";
            }
            queue.push(s);
        }
        return queue;
    }
}

class QueueOperations {

    private List<String> get(Deque<String> queue, boolean even) {

        List<String> evenList = new ArrayList<>();
        List<String> oddList = new ArrayList<>();

        for (String s : queue) {
            if (s.length() % 2 == 0) {
                evenList.add(s);
            } else {
                oddList.add(s);
            }
        }
        return even ? evenList : oddList;
    }

    List<String> getEvenList(Deque<String> queue){
        return get(queue, true);
    }

    List<String> getOddList(Deque<String> queue){
        return get(queue, false);
    }

    static void display(Deque<String> queue) {
        System.out.println("");
        for (String s : queue) {
            System.out.println(s.toString());
        }
        System.out.print("\n\n\n");
    }
}

class ListOperations{
    static void display(List<String> list) {
        System.out.println();
        for (String s : list) {
            System.out.println(s.toString());
        }
        System.out.println("\n\n");
    }
}

public class Application {
    public static void main(String[] args) {

        Deque<String> queue = new NewQueue().generate(50, 50);
        List<String> evenList = new QueueOperations().getEvenList(queue);
        List<String> oddList = new QueueOperations().getOddList(queue);

        //Display outcome
        System.out.println("Queue:");
        QueueOperations.display(queue);
        System.out.println("Even List:");
        ListOperations.display(evenList);
        System.out.println("Odd List:");
        ListOperations.display(oddList);
    }
}