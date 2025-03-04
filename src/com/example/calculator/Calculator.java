package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Object> resultSave = new ArrayList<>();

    public Object calculate(long x, char oper, long y) {
        return switch (oper) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            case '/' -> {
                if (y == 0) {
//                    System.out.println("0으로 나눌 수 없으므로 x를 반환합니다");
                    yield 'x';
                }
                yield x / (double) y;
            }
            default -> {
                System.out.println("연산기호가 잘못됐으므로 x를 반환합니다");
                yield 'x';
            }
        };
    }


    public List<Object> getResultSave() {
        return this.resultSave;
    }

    public void setResultSave(Object result) {
        this.resultSave.add(result);
    }

    public void removeResult() {
        if (resultSave.isEmpty()) {
            System.out.println("저장소가 비어있습니다");
        }
        resultSave.remove(0);
    }
}
