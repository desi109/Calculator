/*
 * Copyright (c) 2020. dmil Calculator
 *
 *
 */

package com.dmil.calculator.main;

import java.util.Scanner;
import static com.dmil.calculator.main.Calculator.createLinearEquationCalculator;
import static com.dmil.calculator.main.Calculator.createSimpleCalculator;
import static com.dmil.calculator.main.CalculatorType.*;

/**
 * The Calculator program implements an application that provides two types of calculators:
 * Simple Operations Calculator, which calculate operations as addition, subtraction, multiplication and division between two numbers.
 * Linear Equations Calculator, which calculate the unknown number in the equation.
 *
 * @author dmil
 * @version 1.0
 */

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = openCalculator();
        System.out.printf(calculator.printSolution());
    }


    private static boolean isStringCalculatorType(String calculatorTypeStr) {
        if (SIMPLE.getType().equalsIgnoreCase(calculatorTypeStr) ||
                EQUATION.getType().equalsIgnoreCase(calculatorTypeStr)) {
            return true;
        } else {
            return false;
        }
    }

    private static Calculator openCalculator() {
        Calculator calculator = null;

        System.out.print(MenuOutput.START_INSTRUCTION);
        String calculatorTypeStr = SCANNER.next();

        while (!isStringCalculatorType(calculatorTypeStr)) {
            System.out.print(MenuOutput.INVALID_CALCULATOR_TYPE);
            calculatorTypeStr = SCANNER.next();
        }

        switch (CalculatorType.valueOf(calculatorTypeStr.toUpperCase())) {
            case SIMPLE:
                System.out.print(MenuOutput.SIMPLE_CALCULATOR_OPENED + MenuOutput.SIMPLE_CALCULATOR_INSTRUCTION);
                calculator = enterInputForSimpleCalculator();
                break;
            case EQUATION:
                System.out.println(MenuOutput.LINEAR_EQUATION_CALCULATOR_OPENED + MenuOutput.LINEAR_EQUATION_CALCULATOR_INSTRUCTION);
                calculator = enterInputForLinearEquationCalculator();
                break;
        }
        return calculator;
    }

    private static Calculator enterInputForSimpleCalculator() {

        double numberOne;
        double numberTwo;
        String operation;

        System.out.print(MenuOutput.X_INPUT);
        String numberOneStr = SCANNER.next();
        while ((!numberOneStr.matches(Regex.REGEX_VALIDATE_NUMBER))) {
            System.out.print(MenuOutput.NUMBER_VALIDATION_SIMPLE_CALCULATOR);
            System.out.print(MenuOutput.X_INPUT);
            numberOneStr = SCANNER.next();
        }
        numberOne = Double.parseDouble(numberOneStr);


        System.out.print(MenuOutput.OPERATION_INPUT);
        operation = SCANNER.next();
        while ((!operation.matches(Regex.REGEX_VALIDATE_OPERATION))) {
            System.out.print(MenuOutput.OPERATION_VALIDATION);
            System.out.print(MenuOutput.OPERATION_INPUT);
            operation = SCANNER.next();
        }

        System.out.print(MenuOutput.Y_INPUT);
        String numberTwoStr = SCANNER.next();
        while ((!numberTwoStr.matches(Regex.REGEX_VALIDATE_NUMBER))) {
            System.out.print(MenuOutput.NUMBER_VALIDATION_SIMPLE_CALCULATOR);
            System.out.print(MenuOutput.Y_INPUT);
            numberTwoStr = SCANNER.next();
        }
        numberTwo = Double.parseDouble(numberTwoStr);

        return createSimpleCalculator(numberOne, numberTwo, operation);
    }


    private static Calculator enterInputForLinearEquationCalculator() {

        String numberOneStr;
        String numberTwoStr;
        String numberThreeStr;
        String operation;

        System.out.print(MenuOutput.X_INPUT);
        numberOneStr = SCANNER.next();
        while ((!numberOneStr.matches(Regex.REGEX_VALIDATE_NUMBER)) && (!numberOneStr.matches(Regex.REGEX_VALIDATE_UNKNOWN))) {
            System.out.println(MenuOutput.NUMBER_VALIDATION_LINEAR_EQUATION_CALCULATOR);
            System.out.print(MenuOutput.X_INPUT);
            numberOneStr = SCANNER.next();
        }


        System.out.print(MenuOutput.OPERATION_INPUT);
        operation = SCANNER.next();
        while (!operation.matches(Regex.REGEX_VALIDATE_OPERATION)) {
            System.out.println(MenuOutput.OPERATION_VALIDATION);
            System.out.print(MenuOutput.OPERATION_INPUT);
            operation = SCANNER.next();
        }


        System.out.print(MenuOutput.Y_INPUT);
        numberTwoStr = SCANNER.next();
        while (((!numberTwoStr.matches(Regex.REGEX_VALIDATE_NUMBER)) & (!numberTwoStr.matches(Regex.REGEX_VALIDATE_UNKNOWN))) | (numberTwoStr.equals(null))) {
            System.out.println(MenuOutput.NUMBER_VALIDATION_LINEAR_EQUATION_CALCULATOR);
            System.out.print(MenuOutput.Y_INPUT);
            numberTwoStr = SCANNER.next();
        }


        System.out.print(MenuOutput.Z_INPUT);
        numberThreeStr = SCANNER.next();
        while ((((!numberThreeStr.matches(Regex.REGEX_VALIDATE_NUMBER)) & (!numberThreeStr.matches(Regex.REGEX_VALIDATE_UNKNOWN)))) | (numberThreeStr.equals(null))) {
            System.out.println(MenuOutput.NUMBER_VALIDATION_LINEAR_EQUATION_CALCULATOR);
            System.out.print(MenuOutput.Z_INPUT);
            numberThreeStr = SCANNER.next();
        }

        return createLinearEquationCalculator(numberOneStr, numberTwoStr, numberThreeStr, operation);
    }

}

