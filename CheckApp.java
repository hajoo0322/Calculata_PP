package calculater_sparta;

public class CheckApp {
    String[] numbersWords = {"zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    public void verify(String number1) throws BadInputException {
        try{
            double num = Double.parseDouble(number1);
            //여기서 숫자가 되면
            Claculater<Double> claculater = new Claculater_Double();

        } catch (NumberFormatException e1){
            //number1은 문자열임
            for (String number : numbersWords) {
                if (number.equals(number1)) {
                    Claculater<String> claculater = new Claculater_String();
                    claculater.setNumber1(number1);
                } else{
                    throw new BadInputException();
                }
            }
        }
    }

    public void check(String sign) {
        for (OperatorType value : OperatorType.values()) {
            if (value.name().equals(sign)){

            }
        }

    }
}
