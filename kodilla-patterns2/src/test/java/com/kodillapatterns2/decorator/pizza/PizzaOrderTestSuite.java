package com.kodillapatterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithHamAndOnion() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println("Ordered: " + description);

        //Then
        assertEquals(new BigDecimal("21.5"), theCost);
        assertEquals("Pizza + ham + onion", description);
    }

    @Test
    public void testPizzaWithHamAndGarlicSauce() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println("Ordered: " + description);

        //Then
        assertEquals(new BigDecimal("21"), theCost);
        assertEquals("Pizza + ham + garlic sauce", description);
    }
    @Test
    public void testPizzaWithHamOnionAndExtraCheese() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println("Ordered: " + description);

        //Then
        assertEquals(new BigDecimal("23"), theCost);
        assertEquals("Pizza + ham + onion + extra cheese", description);
    }

    @Test
    public void testPizzaWithExtraCheeseOnionAndGarlicSauce() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OnionDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println("Ordered: " + description);

        //Then
        assertEquals(new BigDecimal("21"), theCost);
        assertEquals("Pizza + extraCheese + onion + garlic sauce", description);
    }

}
