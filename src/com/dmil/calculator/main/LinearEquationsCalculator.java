/*
 * Copyright (c) 2020. dmil Calculator
 *
 *
 */

package com.dmil.calculator.main;


public class LinearEquationsCalculator implements Calculator {

    private String numberOneStr;
    private String numberTwoStr;
    private String numberThreeStr;
    private String operation;

    public LinearEquationsCalculator(String numberOneStr, String numberTwoStr, String numberThreeStr, String operation) {
        this.numberOneStr = numberOneStr;
        this.numberTwoStr = numberTwoStr;
        this.numberThreeStr = numberThreeStr;
        this.operation = operation;
    }

    public String getNumberOneStr() {
        return numberOneStr;
    }

    public String getNumberTwoStr() {
        return numberTwoStr;
    }

    public String getNumberThreeStr() {
        return numberThreeStr;
    }

    public String getOperation() {
        return operation;
    }

    @Override
    public double solve() {
        String firstNumberStr = getNumberOneStr();
        String secondNumberStr = getNumberTwoStr();
        String thirdNumberStr = getNumberThreeStr();
        String operation = getOperation();
        double result = 0;

        if(MenuOutput.UNKNOWN.equals(firstNumberStr)){
            result = solveEquationForNumberOne(Double.parseDouble(secondNumberStr), Double.parseDouble(thirdNumberStr), operation);
        }
        else if(MenuOutput.UNKNOWN.equals(secondNumberStr)){
            result = solveEquationForNumberTwo(Double.parseDouble(firstNumberStr), Double.parseDouble(thirdNumberStr), operation);
        }
        else if(MenuOutput.UNKNOWN.equals(thirdNumberStr)){
            result = solveEquationForNumberThree(Double.parseDouble(firstNumberStr), Double.parseDouble(secondNumberStr), operation);
        }

        return result;
    }

    @Override
    public String printSolution() {
        String resultToPrint = String.format(MenuOutput.SOLUTION_LINEAR_EQUATION_CALCULATOR, getNumberOneStr(),
                getOperation(), getNumberTwoStr(), getNumberThreeStr(), solve());

        return resultToPrint;
    }

    private double solveEquationForNumberOne(double secondNumber, double thirdNumber, String operation) {

        double firstNumber = 0;
        switch (operation) {
            case "+":
                firstNumber = Calculator.subtract(thirdNumber, secondNumber);
                break;
            case "-":
                firstNumber = Calculator.add(thirdNumber, secondNumber);
                break;
            case "*":
                firstNumber = Calculator.divide(thirdNumber, secondNumber);
                break;
            case "/":
                firstNumber = Calculator.multiply(thirdNumber, secondNumber);
                break;
        }

        return firstNumber;
    }

    private double solveEquationForNumberTwo(double firstNumber, double thirdNumber, String operation) {

        double secondNumber = 0;
        switch (operation) {
            case "+":
                secondNumber = Calculator.subtract(thirdNumber, firstNumber);
                break;
            case "-":
                secondNumber = Calculator.subtract(firstNumber, thirdNumber);
                break;
            case "*":
                secondNumber = Calculator.divide(thirdNumber, firstNumber);
                break;
            case "/":
                secondNumber = Calculator.divide(firstNumber, thirdNumber);
                break;
        }
        return secondNumber;
    }


    private double solveEquationForNumberThree (double firstNumber, double secondNumber, String operation){

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

}

