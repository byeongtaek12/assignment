package com.example.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculatorio {
    Calculator cal = new Calculator();
    Scanner scanner = new Scanner(System.in);
    long x;
    long y;
    Number result;

    public void calculatorIO() {
        while (true) {
            try {
                System.out.print("첫 번째 양의 정수(0 포함)를 입력해주세요: ");
                x = scanner.nextLong();
                System.out.print("두 번째 양의 정수(0 포함)를 입력해주세요: ");
                y = scanner.nextLong();
                if (x < 0 || y < 0) {
                    System.out.println("음수를 적으셨습니다. 다시 입력해주세요.");
                    continue;
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("숫자만 입력해주세요");
                continue;
            }
            while (true) {
                try {
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char oper = scanner.next().charAt(0);
                    result = cal.calculate(x, oper, y); // 계산 값을 반환
                    System.out.println("계산 값: " + result);
                    break;
                } catch (ArithmeticException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            break;
        }
    }

    public void resultSaveIO() {
        boolean flag = true;
        while (flag) {
            System.out.println("값 저장(0), 값 삭제(1), 값 조회(2), 넘어가기(아무거나 숫자 입력)");
            int num;
            try {
                num = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("숫자만 넣어주세요");
                continue;
            }
            switch (num) {
                case 0 -> cal.setResultSave(result);
                case 1 -> {
                    if (cal.getResultSave().isEmpty()) {
                        System.out.println("저장소가 비어있습니다.");
                    }
                    cal.removeResult();
                }
                case 2 -> System.out.println(cal.getResultSave());
                default -> flag = false;
            }
        }
    }

    public boolean exitIO() {
        scanner.nextLine();
        boolean exit = true;
        System.out.println("더 계산하시겠습니까? (exit 입력시 종료, 다른 입력시 계속)");
        String q = scanner.nextLine();
        if (q.equals("exit")) {
            System.out.println("종료하겠습니다");
            exit = false;
        }
        return exit;
    }
}