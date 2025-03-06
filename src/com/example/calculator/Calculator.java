package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Number> resultSave = new ArrayList<>();

    public Number calculate(long x, char oper, long y) { // 계산 메서드
        return switch (oper) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            case '/' -> {
                if (y == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다. 다시 입력해주세요");
                }
                yield x / (double) y;
            }
            default -> throw new IllegalArgumentException("연산기호가 잘못됐습니다. 다시 입력해주세요");

        };
    }


    public List<Number> getResultSave() { // getter
        return this.resultSave;
    }

    public void setResultSave(Number result) { // setter
        this.resultSave.add(result);
    }

    public void removeResult() { // 저장소 삭제 메서드
        if (resultSave.isEmpty()) {
            System.out.println("저장소가 비어있습니다");
        }
        resultSave.remove(0);
    }
}
