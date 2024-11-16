package calculater_sparta.performCalculations;

import calculater_sparta.repository.Database;

public class AddNumberInteger implements Calculate<Integer>{
    @Override
    public Integer calculate() {
        return (int)(Database.number1+Database.number2);
    }
}
