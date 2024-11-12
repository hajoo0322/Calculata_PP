package calculater_sparta;


import java.util.Scanner;

public class CalulatingMachine {
    public static boolean start() throws BadInputException {
        Check parser = new Check();
        Scanner scanner = new Scanner(System.in);
        Database results = new Database();

        System.out.println("숫자를 입력하세요");
        String num1 = scanner.next();
        parser.checkNum(num1,1);

        System.out.println("ADD MINUS MULTIPLY DIVIDE 연산을 선택하세요");
        String sign = scanner.next();
        parser.checkSign(sign);

        System.out.println("숫자를 입력하세요");
        String num2 = scanner.next();
        parser.checkNum(num2,2);

        SaveResults saveResults = new SaveResults();
        saveResults.selectCalculater();



        return true;
    }
}
