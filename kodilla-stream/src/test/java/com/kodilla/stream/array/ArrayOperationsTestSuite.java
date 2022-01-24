package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testgetAverage() {
        //Given
        int numbers[] = {5, 24, 2, 4, 88};
        double expectedAvg = 24.6;

        //When
        double resultAvg = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(expectedAvg, resultAvg, 0.004);
    }
}
