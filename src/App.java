
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            long x = 0;
            long y = 0;
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
                    result = Calculator.calculate(x, oper, y);
                    if (result.equals('x')) {
                        continue;
                    }
                    System.out.println("계산 값: " + result);
                    break;
                }
                System.out.println("값을 저장소에 저장합니다");
                List<Object> newResultSave = cal.getResultSave();
                newResultSave.add(result);
                cal.setResultSave(newResultSave);
                break;
            }

            scanner.nextLine();
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료, 다른 입력시 계속)");
            String s = scanner.nextLine();
            if (s.equals("exit")) {
                exit = false;
                System.out.println("종료하겠습니다");
            }
        }
    }

}