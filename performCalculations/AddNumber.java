package calculater_sparta.performCalculations;

import calculater_sparta.repository.Database;

public class AddNumber implements Calculate<Double> {

    @Override
    public Double calculate(double number1, double number2) {

        return number1+number2;
    }
}

