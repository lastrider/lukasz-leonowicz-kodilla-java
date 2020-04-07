package com.kodilla.Module_2.Task_6_MapAndHashMap;

import java.text.DecimalFormat;
import java.util.*;


class Pupil {
    private String name;
    private String surname;
    private String cardId;

    Pupil(String name, String surname, String cardId) {
        this.name = name;
        this.surname = surname;
        this.cardId = cardId;
    }

    @Override
    public boolean equals(Object o) {
        final Pupil p = (Pupil) o;
        return this.name.equals(p.name) && this.surname.equals(p.surname) && this.cardId.equals(p.cardId);
    }

    @Override
    public int hashCode() {
        return (this.name.hashCode() + this.surname.hashCode() + this.cardId.hashCode()) * 31;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + cardId + ")";
    }
}

class Ratings {

    private List<Integer> listOfRatings = new ArrayList<>();

    Ratings(Integer... listOfRatings) {
        this.listOfRatings = Arrays.asList(listOfRatings);
    }

    Ratings(List<Integer> listOfRatings) {
        this.listOfRatings = listOfRatings;
    }

    double gerAverage() {
        short sum = 0;
        for (Integer rating : this.listOfRatings) {
            sum += rating;
        }
        return (double) sum / listOfRatings.size();
    }
}

public class Application {

    public static void main(String[] args) {

        Pupil pupil1 = new Pupil("Jan", "Kowalski", "204422234");
        Pupil pupil2 = new Pupil("Katarzyna", "Nowak", "204422232");
        Pupil pupil3 = new Pupil("Mateusz", "Konopka", "204422536");
        Pupil pupil4 = new Pupil("Magda", "Kowalczyk", "204421234");

        Ratings ratings1 = new Ratings(Arrays.asList(2, 5, 6, 4, 5, 4));
        Ratings ratings2 = new Ratings(1, 1, 2, 3, 1, 2, 3, 3);
        Ratings ratings3 = new Ratings(5, 6, 6, 4, 5, 6);
        Ratings ratings4 = new Ratings(6, 6, 5, 5, 5);

        Map<Pupil, Ratings> pupilRatingsMap = new HashMap<>();
        pupilRatingsMap.put(pupil1, ratings1);
        pupilRatingsMap.put(pupil2, ratings2);
        pupilRatingsMap.put(pupil3, ratings3);
        pupilRatingsMap.put(pupil4, ratings4);

        DecimalFormat df2 = new DecimalFormat("0.00");

        for (Map.Entry<Pupil, Ratings> pupilRatingsEntry : pupilRatingsMap.entrySet()) {
            System.out.println(pupilRatingsEntry.getKey() + " " + df2.format(pupilRatingsEntry.getValue().gerAverage()));
        }
    }
}
