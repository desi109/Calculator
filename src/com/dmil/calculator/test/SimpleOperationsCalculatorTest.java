/*
 * Copyright (c) 2020. dmil Calculator
 *
 */

package com.dmil.calculator.test;

import com.dmil.calculator.main.Calculator;
import com.dmil.calculator.main.SimpleOperationsCalculator;
import org.junit.Test;
import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.Assert.*;

public class SimpleOperationsCalculatorTest {

    private Calculator calculator;

    @Test
    public void testPrintSolution() {
        String message = "Thе printed solution is not the expected one";
        calculator = new SimpleOperationsCalculator(1,1,"+");
        assertEquals(message,"\nx + y = ?\nResult: 2,00\n", calculator.printSolution());

        calculator = new SimpleOperationsCalculator(1,-1,"+");
        assertEquals(message,"nx + y = ?\nResult: 0,00\n", calculator.printSolution());

        calculator = new SimpleOperationsCalculator(1,2.555,"+");
        assertEquals(message,"nx + y = ?\nResult: 3,56\n",calculator.printSolution());

        calculator = new SimpleOperationsCalculator(1,1,"-");
        assertEquals(message,"nx - y = ?\nResult: 0,00\n", calculator.printSolution());

        calculator = new SimpleOperationsCalculator(1,2,"-");
        assertEquals(message,"nx - y = ?\nResult: -1,00\n", calculator.printSolution());

        calculator = new SimpleOperationsCalculator(1,2,"*");
        assertEquals(message,"nx * y = ?\nResult: 2,00\n", calculator.printSolution());

        calculator = new SimpleOperationsCalculator(1,0,"*");
        assertEquals(message,"\nx * y = ?\nResult: 0,00\n", calculator.printSolution());

        calculator = new SimpleOperationsCalculator(1,-2,"*");
        assertEquals(message,"\nx * y = ?\nResult: -2,00\n", calculator.printSolution());

        calculator = new SimpleOperationsCalculator(1,2,"/");
        assertEquals(message,"\nx / y = ?\nResult: 0,50\n", calculator.printSolution());

        calculator = new SimpleOperationsCalculator(1,0,"/");
        assertEquals(message,"\nx / y = ?\nResult: Infinity\n", calculator.printSolution());
    }

    @Test
    public void testSolve() {
        String message =  "The printed answer is not the expected one";
        calculator = new SimpleOperationsCalculator(1,2,"+");
       assertEquals(message,3.0, calculator.solve(), 0);

        calculator = new SimpleOperationsCalculator(1.0,2.555,"+");
       assertEquals(message,3.555, calculator.solve(),0);

        calculator = new SimpleOperationsCalculator(2,1,"-");
       assertEquals(message,1.0, calculator.solve(),0);

        calculator = new SimpleOperationsCalculator(1,2,"-");
       assertEquals(message,-1.0, calculator.solve(), 0);

        calculator = new SimpleOperationsCalculator(1,2,"*");
       assertEquals(message,2.0, calculator.solve(),0);

        calculator = new SimpleOperationsCalculator(2,0,"*");
       assertEquals(message,0.0, calculator.solve(),0);

        calculator = new SimpleOperationsCalculator(2,-1,"*");
       assertEquals(message,-2.0, calculator.solve(), 0);

        calculator = new SimpleOperationsCalculator(2,1,"/");
        assertEquals(message,2.0, calculator.solve(),0);

        calculator = new SimpleOperationsCalculator(1,2,"/");
        assertEquals(message,0.5, calculator.solve(),0);

        calculator = new SimpleOperationsCalculator(2,0,"/");
        assertEquals(message,Infinity, calculator.solve(), 0);
    }

}
