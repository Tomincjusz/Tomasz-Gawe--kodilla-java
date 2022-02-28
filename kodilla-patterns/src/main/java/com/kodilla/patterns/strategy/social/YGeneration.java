package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.Publisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.Publisher.TwitterPublisher;

public final class YGeneration extends User {
    public YGeneration(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
