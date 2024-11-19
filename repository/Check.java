package calculater_sparta.repository;

import calculater_sparta.exceptionHandling.BadInputException;

public class Check {
    private static final String NUMBER_REG = "^[0-9]*\\.?[0-9]+$";
    Database database;

    public Check(Database database) {
        this.database = database;
    }

    public void checkNum(String num1, int index) throws BadInputException {
        if (index == 1) {
            saveNumber(num1, true);
        } else {
            saveNumber(num1, false);
        }
    }

    //예외 처리 true 면 1번에 기록 false면 2번에 기록
    private void saveNumber(String num1, boolean first) throws BadInputException {

        if (num1.matches(NUMBER_REG)) {
            if (first) {
                database.setNumber1(Double.parseDouble(num1));
            } else {
                database.setNumber2(Double.parseDouble(num1));
            }
        } else {
            throw new BadInputException("숫자");
        }
    }

    //알맞은 부호를 입력했는지 확인
    public void checkSign(String sign) throws BadInputException {
        boolean isOk = true;
        for (OperatorType value : OperatorType.values()) {
            if (value.name().equals(sign)) {
                isOk = false;
                database.setSign(sign);
                break;
            }
        }
        if(isOk) {
            throw new BadInputException("부호");
        }

    }

}
