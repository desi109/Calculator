/*
 * Copyright (c) 2020. dmil Calculator
 *
 */

package com.dmil.calculator.main;

public enum CalculatorType {

    SIMPLE("simple"),
    EQUATION("equation");

    private String type;

    private CalculatorType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
