package com.kodilla.Module_4.Task_4_CannonCollection;

import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Canon> canonList = new LinkedList<>();

        Canon canon1 = new Canon(true);
        Canon canon2 = new Canon(false);
        Canon canon3 = new Canon(true);
        Canon canon4 = new Canon(false);
        Canon canon5 = new Canon(true);

        canonList.add(canon1);
        canonList.add(canon2);
        canonList.add(canon3);
        canonList.add(canon4);
        canonList.add(canon5);

        for (Canon canon : canonList) {
            canon.fire();
        }

    }

}

class Canon {
    public boolean loaded;

    public Canon(boolean loaded) {
        this.loaded = loaded;
    }

    void fire() {
        if (!loaded) {
            System.out.println("Lack of bullet. Missile will be loaded.");
            this.loaded = true;
        }


    }
}
