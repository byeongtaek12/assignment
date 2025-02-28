import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Object> resultSave = new ArrayList<>();

    public Object calculate (long x, char oper, long y) {
        Object result = switch (oper) {
            case '+' -> x + y ;
            case '-' -> x - y ;
            case '*' -> x * y ;
            case '/' -> {
                if (y == 0) {
                    System.out.println("0으로 나눌 수 없으므로 0을 반환합니다");
                    yield 0;
                }
                yield x / (double)y;
            }
            default -> {
                System.out.println("연산기호가 잘못됐으므로 0을 반환합니다");
                yield 0;
            }
        };
        return result;
    }
}
