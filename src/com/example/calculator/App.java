package com.example.calculator;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            long x;
            long y;
            Object result;
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
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char oper = scanner.next().charAt(0);
                    result = Calculator.calculate(x, oper, y); // 계산 값을 반환
                    if (result.equals('x')) { // 예외 발생시 문자 x값이 반환되어 실행
                        continue;
                    }
                    System.out.println("계산 값: " + result);
                    break;
                }

                System.out.println("값을 저장소에 저장합니다");
                List<Object> newResultSave = cal.getResultSave(); // 튜터님 개선 사항 적용x
                newResultSave.add(result);
                cal.setResultSave(newResultSave);
                cal.showResultSave();

                System.out.println("저장소에 저장된 첫 번째 값을 삭제를 원하시면 1, 아니면 0을 써주세요");
                int s = scanner.nextInt();
                if (s==1) {
                    cal.removeResult();
                    cal.showResultSave();
                }
                break;
            }

            scanner.nextLine();
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료, 다른 입력시 계속)");
            String q = scanner.nextLine();
            if (q.equals("exit")) {
                exit = false;
                System.out.println("종료하겠습니다");
            }
        }
    }

}