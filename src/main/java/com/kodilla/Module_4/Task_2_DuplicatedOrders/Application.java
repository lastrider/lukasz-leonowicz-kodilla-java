package com.kodilla.Module_4.Task_2_DuplicatedOrders;

import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Set<Order> database = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            database.add(new Order());
        }

        for (Order order : database) {
            System.out.println(order.getOrder());
        }

    }
}

class Order {
    private static int nextOrder = 0;
    private int orderNumber;

    public Order() {
        this.orderNumber = nextOrder++;
    }

    public int getOrder() {
        return this.orderNumber;
    }
}
