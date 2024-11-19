package calculater_sparta.service;


import calculater_sparta.repository.Check;
import calculater_sparta.exceptionHandling.BadInputException;
import calculater_sparta.repository.Database;

import java.util.Scanner;

public class CalculatingMachine {
    public static boolean start() throws BadInputException {
        Database database = new Database();
        Check check = new Check(database);
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");

        String num1 = scanner.next();
        check.checkNum(num1,1);
        System.out.println("ADD MINUS MULTIPLY DIVIDE 연산을 선택하세요");
        String sign = scanner.next();
        check.checkSign(sign);

        System.out.println("숫자를 입력하세요");
        String num2 = scanner.next();
        check.checkNum(num2,2);

        SaveResults saveResults = new SaveResults(database);

        saveResults.selectCalculater();
        saveResults.saveData(saveResults.orderCalculate());

        System.out.println("종료하려면(exit)");
        String isStop = scanner.next();

        //exit 를 입력하면 저장된 계산결과를 모두출력
        if (isStop.equals("exit")){
            System.out.println("숫자를 입력해주세요 입력한값보다 큰기록의 계산결과만 출력합니다.");
            double comparisonValue = scanner.nextDouble();
            System.out.println("계산결과를 출력합니다.");
            saveResults.database.compare(comparisonValue);
            return false;
        }
        return true;
    }
}
