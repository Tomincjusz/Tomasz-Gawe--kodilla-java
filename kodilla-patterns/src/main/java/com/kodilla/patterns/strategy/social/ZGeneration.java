package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.Publisher.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.Publisher.TwitterPublisher;

public final class ZGeneration extends User {
    public ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
