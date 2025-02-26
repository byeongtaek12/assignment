import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        while (exit!=1) {
            long x;
            long y;
            while (true) {
                try {
                    System.out.print("첫 번째 양의 정수(0 포함)를 입력해주세요: ");
                    x = scanner.nextLong();
                    System.out.print("두 번째 양의 정수(0 포함)를 입력해주세요: ");
                    y = scanner.nextLong();
                    if (x<0 || y<0) {
                        System.out.println("음수를 적으셨습니다. 다시 입력해주세요.");
                        continue;
                    }
                }catch(Exception e){
                    scanner.nextLine();
                    System.out.println("숫자만 입력해주세요");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("사칙연산 기호를 입력하세요: ");
                String z = scanner.next();
                char z1 = z.charAt(0);

                if (z1 == '+') {
                    System.out.println("더한 값: "+ (x+y));
                }else if (z1 == '-') {
                    System.out.println("뺀 값: "+ (x-y));
                }else if (z1 == '*') {
                    System.out.println("곱한 값: "+ (x*y));
                }else if (z1 == '%') {
                    try {
                        if (!(x % y == 0)) {
                            double y1=(double)y;
                            System.out.println("나눈 값: "+ (x/y1));
                        }else {
                            System.out.println("나눈 값: "+ (x/y));
                        }
                    }catch (Exception e) {
                        System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
                        continue;
                    }
                }else {
                    System.out.println("잘못된 사칙연산 기호입니다");
                    continue;
                }
                break;
            }

            scanner.nextLine();
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료, 다른 입력시 계속)");
            String s = scanner.nextLine();
            if (s.equals("exit")) {
                exit=1;
                System.out.println("종료하겠습니다");
            }else {
                exit=0;
            }
        }
    }
}