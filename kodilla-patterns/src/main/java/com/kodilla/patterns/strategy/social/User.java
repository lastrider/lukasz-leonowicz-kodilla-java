package com.kodilla.patterns.strategy.social;

public class User {
    private String name;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }

    public String getSocialPublisher() {
        return publisher.share();
    }
}
