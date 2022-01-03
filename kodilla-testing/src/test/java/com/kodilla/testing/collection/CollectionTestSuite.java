package com.kodilla.testing.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When created normal list of numbers")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        List<Integer> emptyList = new ArrayList<>();

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> resultEmptyList = oddNumbersExterminator.exterminate(emptyList);
        //When
        List<Integer> expectedResultList = new ArrayList<>();
        //Then
        Assertions.assertEquals(expectedResultList, resultEmptyList);
    }

    @DisplayName("When created normal list of numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> resultNormalList = oddNumbersExterminator.exterminate(normalList);
        //When
        List<Integer> expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(4);
        //Then
        Assertions.assertEquals(expectedResultList, resultNormalList);
    }
}
