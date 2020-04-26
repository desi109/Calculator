/*
 * Copyright (c) 2020. dmil Calculator
 *
 */

package com.dmil.calculator.test;

import com.dmil.calculator.main.Calculator;
import com.dmil.calculator.main.LinearEquationsCalculator;
import org.junit.Test;
import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.Assert.*;

public class LinearEquationCalculatorTest {

    private Calculator calculator;

    @Test
    public void testPrintSolution() {
        String message = "Thе printed solution is not the expected one";
        calculator = new LinearEquationsCalculator("1", "1", "?", "+");
        assertEquals(message, "\n1 + 1 = ?\nResult: 2,00\n", calculator.printSolution());

        calculator =  new LinearEquationsCalculator("1", "?", "2", "+");
        assertEquals(message, "\n1 + ? = 2\nResult: 1,00\n",calculator.printSolution());

        calculator = new LinearEquationsCalculator("?", "1", "2", "+");
        assertEquals(message, "\n? + 1 = 2\nResult: 1,00\n", calculator.printSolution());

        calculator = new LinearEquationsCalculator("1.3", "1.2", "?", "+");
        assertEquals(message, "\n1.3 + 1.2 = ?\nResult: 2,50\n", calculator.printSolution());

        calculator = new LinearEquationsCalculator("1", "0", "?", "/");
        assertEquals(message, "\n1 / 0 = ?\nResult: Infinity\n", calculator.printSolution());
    }

    @Test
    public void testSolve() {
        String message =  "The printed answer is not the expected one";
        calculator = new LinearEquationsCalculator("1", "1", "?", "+");
        assertEquals(message,2.0, calculator.solve(), 0);

        calculator =  new LinearEquationsCalculator("1", "?", "2", "+");
        assertEquals(message,  1.0, calculator.solve(),0);

        calculator = new LinearEquationsCalculator("?", "1", "2", "+");
        assertEquals(message,  1.0, calculator.solve(),0);

        calculator = new LinearEquationsCalculator("1.3", "1.2", "?", "+");
        assertEquals(message,  2.5, calculator.solve(),0);

        calculator = new LinearEquationsCalculator("1", "0", "?", "/");
        assertEquals(message,  Infinity, calculator.solve(),0);
    }

}
