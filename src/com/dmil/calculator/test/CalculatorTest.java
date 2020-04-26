/*
 * Copyright (c) 2020. dmil Calculator
 *
 */

package com.dmil.calculator.test;

import com.dmil.calculator.main.Calculator;
import org.junit.Test;
import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        String message = "The number from operation addition, is not the expected one";
        assertEquals(message, 3.0, Calculator.add(1, 2), 0);
        assertEquals(message, -1.0, Calculator.add(1, -2), 0);
        assertEquals(message, 4.055, Calculator.add(1.555, 2.5), 0);
    }

    @Test
    public void testSubtract() {
        String message = "The number from operation subtraction, is not the expected one";
        assertEquals(message, 1.0, Calculator.subtract(2, 1), 0);
        assertEquals(message, 3.0, Calculator.subtract(1, -2), 0);
        assertEquals(message, -1.0, Calculator.subtract(1, 2), 0);
        assertEquals(message, 1.3, Calculator.subtract(2.5, 1.2), 0);
    }

    @Test
    public void testMultiply() {
        String message = "The number from operation multiplication, is not the expected one";
        assertEquals(message, 2.0, Calculator.multiply(2, 1), 0);
        assertEquals(message, -2.0, Calculator.multiply(1, -2), 0);
        assertEquals(message, 0.0, Calculator.multiply(1, 0), 0);
        assertEquals(message, 3.000, Calculator.multiply(2.500, 1.2), 0);
    }

    @Test
    public void testDivide() {
        String message = "The number from operation division, is not the expected one";
        assertEquals(message, 2.0, Calculator.divide(2, 1), 0);
        assertEquals(message, -0.5, Calculator.divide(1, -2), 0);
        assertEquals(message, Infinity, Calculator.divide(1, 0), 0);
        assertEquals(message, 2.00, Calculator.divide(2.4, 1.20), 0);
    }

}
