package com.example.calculator;

public enum OperatorType {
    PLUS('+'), MINUS('-'), MULTIPLY('*'), DIVISION('/');

    private final Character oper;

    OperatorType(Character oper ) {
        this.oper = oper;
    }

    public Character getOper() {
        return this.oper;
    }

}
