import java.util.InputMismatchException;
import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            long x=0;
            long y=0;
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
                break;
            }

            while (true) {
                System.out.print("사칙연산 기호를 입력하세요: ");
                char z = scanner.next().charAt(0);
                switch (z) {
                    case '+' -> System.out.println("더한 값: " + (x + y));
                    case '-' -> System.out.println("뺀 값: " + (x - y));
                    case '*' -> System.out.println("곱한 값: " + (x * y));
                    case '/' -> {
                        if (y == 0) {
                            System.out.println("0으로 나눌 수 없습니다");
                            continue;
                        }
                        double result = (x % y == 0) ? (x / y) : (x / (double)y);
                        System.out.println(result);
                    }
                    default -> {
                        System.out.println("연산기호가 잘못됐습니다");
                        continue;
                    }
                }
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