package calculater_sparta.performCalculations;

import calculater_sparta.repository.Database;

public class AddNumber implements Calculate<Double> {


    @Override
    public Double calculate() {

        return Database.number1+Database.number2;
    }
}

