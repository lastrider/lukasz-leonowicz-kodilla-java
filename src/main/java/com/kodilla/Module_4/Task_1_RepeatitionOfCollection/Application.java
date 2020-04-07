package com.kodilla.Module_4.Task_1_RepeatitionOfCollection;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ListMenu listMenu = new ListMenu();
        List<String> list = listMenu.create();
        System.out.println(listMenu.displayList(list));
    }
}

class ListMenu {

    List<String> create() {

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        return companies;
    }

    String displayList(List<String> list) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (String item : list) {
            if (i++ == 0) {
                builder.append(item);
            } else {
                builder.append(", " + item);
            }
        }
        return builder.toString();
    }
}
