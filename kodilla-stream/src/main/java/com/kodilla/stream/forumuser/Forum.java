package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"Pyro",'M',19,4,2000,84));
        userList.add(new ForumUser(2,"Fuzzy",'M',20,4,2000,14));
        userList.add(new ForumUser(3,"Cheery",'M',21,4,2000,63));
        userList.add(new ForumUser(4,"Doggie",'F',5,6,1951,20));
        userList.add(new ForumUser(5,"Braveheart",'M',22,4,1933,0));
        userList.add(new ForumUser(6,"Cookie",'F',6,8,1975,71));
        userList.add(new ForumUser(7,"Rose",'F',24,3,1991,19));
        userList.add(new ForumUser(8,"King",'M',9,9,1990,99));
        userList.add(new ForumUser(9,"Blessed",'F',10,11,1931,34));
        userList.add(new ForumUser(10,"Dynamite",'F',30,5,1943,52));
        userList.add(new ForumUser(11,"Twitch",'M',30,4,1982,87));
        userList.add(new ForumUser(12,"Tank",'M',5,11,2000,70));
        userList.add(new ForumUser(13,"Dapper",'F',18,12,1933,95));
        userList.add(new ForumUser(14,"Merry",'M',15,1,1996,0));
        userList.add(new ForumUser(15,"Answer",'F',12,1,1989,59));
        userList.add(new ForumUser(16,"Blade",'F',13,6,1972,80));
        userList.add(new ForumUser(17,"Dandy",'F',17,6,1960,85));
        userList.add(new ForumUser(18,"Bud",'M',18,4,1998,82));
        userList.add(new ForumUser(19,"Loco",'M',9,1,1939,22));
        userList.add(new ForumUser(20,"Shorty",'F',27,1,1953,20));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}