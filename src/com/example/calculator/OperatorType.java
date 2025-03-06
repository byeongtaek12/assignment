package com.example.calculator;

public enum OperatorType { // enum 적용
    PLUS('+'), MINUS('-'), MULTIPLY('*'), DIVISION('/');

    private final char oper;

    OperatorType(char oper) {
        this.oper = oper;
    }

    public static OperatorType fromChar(char oper) {
        for (OperatorType operatorType : values()) {
            if (operatorType.oper==oper) {
                return operatorType;
            }
        }
        throw new IllegalArgumentException("연산기호가 잘못됐습니다. 다시 입력해주세요");
    }
}
