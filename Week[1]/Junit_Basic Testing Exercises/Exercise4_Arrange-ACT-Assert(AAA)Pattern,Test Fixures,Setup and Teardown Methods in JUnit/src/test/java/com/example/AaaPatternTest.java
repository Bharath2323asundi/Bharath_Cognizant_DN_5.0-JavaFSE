package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AaaPatternTest {
    private int value;

    @Before
    public void setUp() {
        value = 10;
    }

    @After
    public void tearDown() {
        value = 0;
    }

    @Test
    public void shouldAddTwoNumbersUsingAaaPattern() {
        // Arrange
        int firstNumber = 3;
        int secondNumber = 7;

        // Act
        int result = firstNumber + secondNumber;

        // Assert
        assertEquals(10, result);
    }

    @Test
    public void shouldUseSetupValueInTest() {
        // Arrange
        int expected = 10;

        // Act
        int actual = value;

        // Assert
        assertEquals(expected, actual);
        assertTrue(actual > 0);
    }
}
