package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.Publisher.TwitterPublisher;

public final class Millenials extends User {
    public Millenials(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}