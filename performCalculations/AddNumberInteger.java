package calculater_sparta.performCalculations;

import calculater_sparta.repository.Database;

public class AddNumberInteger implements Calculate<Integer>{
    @Override
    public Integer calculate(double number1, double number2) {
        return (int)(number1+number2);
    }
}
