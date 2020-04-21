package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postCount;

    public ForumUser(int id, String username, char sex, int day, int month, int year, int postCount) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.postCount = postCount;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
