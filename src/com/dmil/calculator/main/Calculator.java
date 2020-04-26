/*
 * Copyright (c) 2020. dmil Calculator
 *
 *
 */

package com.dmil.calculator.main;

public interface Calculator {

    static Calculator createSimpleCalculator(double numberOne, double numberTwo, String operation) {
        return new SimpleOperationsCalculator(numberOne, numberTwo, operation);
    }

    static Calculator createLinearEquationCalculator(String numberOneStr, String numberTwoStr, String numberThreeStr, String operation) {
        return new LinearEquationsCalculator(numberOneStr, numberTwoStr, numberThreeStr, operation);
    }

    static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    double solve();

    String printSolution();
}

