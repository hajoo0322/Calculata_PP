package calculater_sparta.repository;

import calculater_sparta.exceptionHandling.BadInputException;

public class Check {
    private static final String NUMBER_REG = "^[0-9]*\\.?[0-9]+$";

    public void checkNum(String num1, int index) throws BadInputException {
      if (index==1){
          saveNumber(num1, true);
      } else {
          saveNumber(num1,false);
      }
    }
    //예외 처리 true 면 1번에 기록 false면 2번에 기록
    private void saveNumber(String num1, boolean first) throws BadInputException {
        if (num1.matches(NUMBER_REG)) {
            if (first) {

                Database.number1= Double.parseDouble(num1);
            }else{
                Database.number2= Double.parseDouble(num1);
            }
        }else {
            throw new BadInputException("숫자");
        }
    }
    //알맞은 부호를 입력했는지 확인
    public void checkSign(String sign) throws BadInputException {
        if (OperatorType.isSame(sign)) {
            for (OperatorType value : OperatorType.values()) {
                if (value.name().equals(sign)) {
                    Database.sign = sign;
                }
            }
        } else {
            throw new BadInputException("알맞은 부호를 입력하시오");
        }
    }

}
