/*
 * Copyright (c) 2020. dmil Calculator
 *
 */

package com.dmil.calculator.main;

public final class MenuOutput {
    public static final String START_INSTRUCTION = "\nIf you want to open the Simple Calculator type: simple\n" +
            "If you want to open the Calculator for solving Linear Equations, type: equation\n" +
            "Which Calculator do you want to open?\n";
    public static final String INVALID_CALCULATOR_TYPE = "\nYour input is invalid! To open calculator, type: simple or equation\n" +
            "Which Calculator do you want to open?\n";
    public static final String SIMPLE_CALCULATOR_OPENED = "\nSimple Calculator -> Opened\n";
    public static final String SIMPLE_CALCULATOR_INSTRUCTION = "\nYou can use -> +,  -,  *,  /\n" +
            "Enter your mathematical problem: \n";
    public static final String LINEAR_EQUATION_CALCULATOR_OPENED = "\nLinear Equation Calculator -> Opened\n";
    public static final String LINEAR_EQUATION_CALCULATOR_INSTRUCTION = "\nYou can use -> +,  -,  *,  /\n" +
            "For the unknown in the equation type: ?\n" +
            "Enter your mathematical problem: \n";
    public static final String X_INPUT = "\nx: ";
    public static final String OPERATION_INPUT = "\noperation: ";
    public static final String Y_INPUT = "\ny: ";
    public static final String Z_INPUT = "\n= z: ";
    public static final String UNKNOWN = "?";
    public static final String NUMBER_VALIDATION_SIMPLE_CALCULATOR = "\nYour input is invalid, please enter number! (ex.: 3 or 3.5)\n";
    public static final String NUMBER_VALIDATION_LINEAR_EQUATION_CALCULATOR = "\nYour input is invalid, please enter number! (ex.: 3 or 3.5 or ?)\n";
    public static final String OPERATION_VALIDATION = "\nYour input is invalid! Please enter operation (+, -, *, /).\n";
    public static final String SOLUTION_SIMPLE_OPERATION_CALCULATOR = "\nx %s y = ?\n" +
            "Result: %.2f\n";
    public static final String SOLUTION_LINEAR_EQUATION_CALCULATOR = "\n%s %s %s = %s\n" +
            "Result: %.2f\n";

}
