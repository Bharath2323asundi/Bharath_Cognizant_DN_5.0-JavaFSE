package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void addShouldReturnSum() {
        // Arrange
        int firstNumber = 2;
        int secondNumber = 3;

        // Act
        int result = calculator.add(firstNumber, secondNumber);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void subtractShouldReturnDifference() {
        // Arrange
        int firstNumber = 4;
        int secondNumber = 3;

        // Act
        int result = calculator.subtract(firstNumber, secondNumber);

        // Assert
        assertEquals(1, result);
    }
}
