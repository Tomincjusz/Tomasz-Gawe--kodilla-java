package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {
    @Test
    void TestCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 6;
        double b = 2;

        //When
        double result1 = calculator.add(a, b);
        double result2 = calculator.sub(a, b);
        double result3 = calculator.mul(a, b);
        double result4 = calculator.div(a, b);

        //Then
        assertEquals(8, result1);
        assertEquals(4, result2);
        assertEquals(12, result3);
        assertEquals(3, result4);
    }
}
