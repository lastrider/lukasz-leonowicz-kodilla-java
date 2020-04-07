package com.kodilla.Module_1.Task_3_Knight;

interface Quest {
    void process();
}

class DeadIsLandQuest implements Quest {
    public void process() {
        System.out.println("Dead is land quest has been begun.");
    }
}

class EliteKnightQuest implements Quest {
    public void process() {
        System.out.println("Elite knight quest has been begun.");
    }
}

class Knight {
    Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void choose() {
        quest.process();
    }
}

public class Application {
    public static void main(String[] args) {
        Knight knight = new Knight(new EliteKnightQuest());
        knight.quest.process();
        String name = knight.quest.toString().substring(0, knight.quest.toString().indexOf("@"));
        System.out.println("Quest: " + name + " has been finished.");
    }
}
