package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    private final List<Number> resultSave = new ArrayList<>();

    public Number calculate(long x, char oper, long y) {
        // enum 적용
        OperatorType operatorType = OperatorType.fromChar(oper);
        return switch (operatorType) {
            case PLUS -> x + y;
            case MINUS -> x - y;
            case MULTIPLY-> x * y;
            case DIVISION -> {
                if (y == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다. 다시 입력해주세요");
                }
                yield x / (double) y;
            }
        };
    }

    public List<Number> getResultSave() {
        return this.resultSave;
    }

    public void setResultSave(Number result) {
        this.resultSave.add(result);
    }

    public void removeResult() {
        if (resultSave.isEmpty()) {
            System.out.println("저장소가 비어있습니다");
        }
        resultSave.remove(0);
    }
}
