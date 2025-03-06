package com.example.calculator;

public enum OperatorType { // enum 적용시키지 못했음
    PLUS('+'), MINUS('-'), MULTIPLY('*'), DIVISION('/');

    private final Character oper;

    OperatorType(Character oper ) {
        this.oper = oper;
    }

    public Character getOper() {
        return this.oper;
    }

}
