package com.kodillapatterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Aspect
@Component
public class OrderFacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacadeWatcher.class);

    @Before("execution(* com.kodillapatterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order,userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info(
                "Logging the event: OrderFacade processOrder() call:\n" +
                        "Class: " + object.getClass().getName() +
                        "\nArgs: " + "OrderDto:" + order.getItems().stream()
                        .map(n ->  " item id: " + n.getProductId().toString())
                        .collect(Collectors.joining(",")) +
                        "\nUserId: " + userId);
    }
}
