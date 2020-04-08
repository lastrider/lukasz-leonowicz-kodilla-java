package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> exterminate(ArrayList<Integer> list) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (Integer number : list) {
            if (number % 2 == 0) {
                evenList.add(number);
            }
        }
        return evenList;
    }
}
