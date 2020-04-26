/*
 * Copyright (c) 2020. dmil Calculator
 *
 *
 */

package com.dmil.calculator.main;

public class SimpleOperationsCalculator implements Calculator {

    private double numberOne;
    private double numberTwo;
    private String operation;

    public SimpleOperationsCalculator(double numberOne, double numberTwo, String operation) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.operation = operation;
    }

    public double getNumberOne() { return numberOne; }
    public double getNumberTwo() { return numberTwo; }
    public String getOperation() { return operation; }

    @Override
    public double solve() {
        double firstNumber = getNumberOne();
        double secondNumber = getNumberTwo();
        String operation = getOperation();

        double thirdNumber = 0;
        switch (operation) {
            case "+":
                thirdNumber = Calculator.add(firstNumber, secondNumber);
                break;
            case "-":
                thirdNumber = Calculator.subtract(firstNumber, secondNumber);
                break;
            case "*":
                thirdNumber = Calculator.multiply(firstNumber, secondNumber);
                break;
            case "/":
                thirdNumber = Calculator.divide(firstNumber, secondNumber);
                break;
        }

        return thirdNumber;
    }

    @Override
    public String printSolution() {
        String resultToPrint = String.format(MenuOutput.SOLUTION_SIMPLE_OPERATION_CALCULATOR,
                getOperation(), solve());

        return resultToPrint;
    }

}
