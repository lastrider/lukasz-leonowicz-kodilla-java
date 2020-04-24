package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class World {
    private final List<Continent> continentList = new ArrayList<>();


    public World(Continent... arg) {
        this.continentList.addAll(Arrays.asList(arg));
    }

    public List<Continent> getContinentList() {
        return continentList;
    }
}
